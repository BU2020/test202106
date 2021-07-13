package com.zhengzhou.crm.until;

import java.util.UUID;

public class UUIDUntil {
    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
