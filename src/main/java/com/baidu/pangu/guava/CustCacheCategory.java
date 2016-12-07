package com.baidu.pangu.guava;

/**
 * Created by yangchuanlian on 2016/7/29.
 */
public enum CustCacheCategory {

    BASIC_INFO(1, "cust_info_cache", "基本信息"),
    CONTACT_INFO(2, "contact_cache", "联系人信息"),
    CONTACT_DETAIL_INFO(3, "contact_detail_info_cache", "联系人详情"),
    SITE_INFO(4, "cust_site_info_cache", "网址信息"),
    OPTIONAL_INFO(5, "cust_optional_info_cache", "可选信息"),
    ADDRESS_INFO(6, "cust_address_info_cache", "地址信息"),
    QUALIFICATION_INFO(7, "cust_qualification_info_cache", "资质信息"),
    ACCESSORY_INFO(8, "cust_accessory_info_cache", "附件信息"),
    ABANDON_INFO(9, "cust_abandon_info_cache", "废弃信息"),
    CSC_INFO(10, "cust_csc_info_cache", "CSC信息"),
    PRODUCTLINE_INFO(11, "cust_productline_info_cache", "产品线信息"),
    LABEL_INFO(12, "cust_label_info_cache", "标签信息"),
    TRADE3_INFO(13, "cust_trade3_info_cache", "三级行业信息"),
    IMPORT_INFO(14, "cust_import_info_cache", "导入批次信息");

    private int id;

    private String value;

    private String desc;


    CustCacheCategory(int id, String value, String desc) {
        this.id = id;
        this.value = value;
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
