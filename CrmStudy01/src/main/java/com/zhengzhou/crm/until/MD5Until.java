package com.zhengzhou.crm.until;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Until {
    public static String getMD5(String password) throws NoSuchAlgorithmException {
//        得到一个信息摘要器
        MessageDigest digest = MessageDigest.getInstance("md5");
        byte[] result = digest.digest(password.getBytes());
        StringBuffer buffer = new StringBuffer();
//        把每一个byte,做一个与算法 0xff
        for (byte b:result){
            int number = b&0xff;
            String str = Integer.toHexString(number);
            if (str.length()==1){
                buffer.append("0");
            }
            buffer.append(str);
        }
        return buffer.toString();
    }
}
