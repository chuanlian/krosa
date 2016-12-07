package com.baidu.pangu;

public enum JobModule {
    // 新盘古消息用
    support(1, "订单模块"), callout(2, "商机模块"), customer(3, "客户模块"), reminder(4, "提醒"), personhint(5,
            "私有线索模块"), nuomi(6, "糯米数据转出"), market(7, "销售活动"),

    // 客发大数据增量推送用
    ipanguHintInfoQ(11, "线索基本信息变化"), ipanguHintCleanoutQ(12, "线索清洗过程信息"), ipanguCustInfoQ(13,
            "客户资料基本信息"), ipanguCustSaleQ(14, "资料销售过程信息"), ipanguOppQ(15, "商机状态信息");


    private int code;
    private String name;

    private JobModule(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}