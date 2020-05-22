package com.imooc.sell.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.org.apache.xpath.internal.objects.XObject;


public class JsonUtil {
    //json格式化
    public static String toJson(Object object){
        GsonBuilder gsonBuilder=new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gosn=gsonBuilder.create();
        return gosn.toJson(object);

    }
}
