package com.baidu.pangu.guava;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

import java.util.Collection;

/**
 * Created by yangchuanlian on 2016/7/29.
 */
public class App {

    public static void main(String[] args) {
        String[] names = new String[10];
        for (int k = 0; k < 10; k++) {
            names[k] = "" + k;
        }
        System.out.println(JSON.toJSONString(Lists.newArrayList(names)));
        System.out.println(JSON.toJSONString(names));
        CustCacheCategory[] enumConstants = CustCacheCategory.class.getEnumConstants();
        System.out.println(JSON.toJSONString(enumConstants));
        Predicates.containsPattern("a");
        final Collection<CustCacheCategory> filteredCacheCategory = Collections2.filter(Lists.newArrayList(enumConstants), new Predicate<CustCacheCategory>() {
            @Override
            public boolean apply(CustCacheCategory input) {
                return input.getId() != CustCacheCategory.CONTACT_INFO.getId() && input.getId() != CustCacheCategory.CONTACT_DETAIL_INFO.getId();
            }
        });
        System.out.println(JSON.toJSONString(filteredCacheCategory));

        Predicate<Integer> pre = new Predicate<Integer>() {
            @Override
            public boolean apply(Integer input) {
                return false;
            }
        };


    }
}
