
案例一

List<String> list = new ArrayList<>();

Collections.addAll(list, "111","222","333","444");

List<String> list2 = new ArrayList<>();

Collections.addAll(list2, "333","444","555","666");


// 输出集合list的元素
list.stream().forEach(s -> {System.out.println(s);});

// 得到两个集合的相同元素
list.stream().forEach(e -> {
	List<String> list3 = list2.stream().filter(bd -> e.equals(bd)).collect(Collectors.toList());
	if(list3.size() > 0){
		System.out.println(list3);
	}
});


案例二
/**
 * 将所有拒绝参与评标单位的状态，不参与评审，不进入下一步，不参与基准值计算 [功能详细描述]
 * 
 * @param biaoDuanGuid
 * @throws Exception
 */
public void updateIsNotCanYuPb(String biaoDuanGuid) throws Exception {
    String sql = "select rowguid,isnextpass,IsCalculated,IsCanYuPb from PingBiao_KaiBiaoTouBiao where BiaoDuanGuid=?1";
    List<Record> dwList = service.findList(sql, Record.class, biaoDuanGuid);
    List<Record> unPassList = dwList.stream().filter(p -> !"1".equals(p.getStr("IsCanYuPb")))
            .collect(Collectors.toList());
    for (int i = 0; i < unPassList.size(); i++) {
        unPassList.get(i).set("isnextpass", "0");
        unPassList.get(i).set("IsCalculated", "0");
    }
    service.execDBUpdateTable_SqlBulkCopy(unPassList, "PingBiao_KaiBiaoTouBiao");
}

案例三
/** 获取标段所有被标记为废标节点的评审名称及序号 */
public List<PingbiaoPSTypeExt> getFeiBiaoJieDian(String biaoDuanGuid) {
    String sql = "select  pfxtype,pfxname from PingBiao_PSTypeExt where biaoduanguid=?1 and isfeibiaojiedian='1' group by pfxtype,pfxname ";
    List<PingbiaoPSTypeExt> feiBiaoJieDianList = service.findList(sql, PingbiaoPSTypeExt.class, biaoDuanGuid);
    // 根据psorder字段进行排序
    feiBiaoJieDianList = feiBiaoJieDianList.stream().sorted((r1, r2) -> {
        Integer step1 = r1.getInt("pfxtype");
        Integer step2 = r2.getInt("pfxtype");
        return step1.compareTo(step2);
    }).collect(Collectors.toList());
    return feiBiaoJieDianList;
}


案例四
public void startImportCB() throws InterruptedException, ExecutionException {
    long startDate = CommonFunction.GetStartTick();
    List<Record> resultList = pingBiaoKaiBiaoTouBiaoService.getTBEncryDanWei(biaoDuanGuid);
    ForkJoinPool myPool = new ForkJoinPool(8);
    myPool.submit(() ->
    resultList.parallelStream().forEach(danWei -> {
        InputStream is = new AttachManager().GetJieMiTBFile(biaoDuanGuid, danWei.getStr("TBFileAttchGuid"),
                danWei.getStr("tbfileattachconnectionstring")).getContent();
        importCBInfo(is, danWei);
    })
    ).get();
    
    System.out.println(CommonFunction.GetSpanSecond(startDate));
}


