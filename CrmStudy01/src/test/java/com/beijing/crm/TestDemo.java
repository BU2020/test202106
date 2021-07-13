package com.beijing.crm;

import com.zhengzhou.crm.until.MD5Until;

import java.security.NoSuchAlgorithmException;

public class TestDemo {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String pwd = "123";
        pwd = MD5Until.getMD5(pwd);
        System.out.println(pwd);
    }
}
