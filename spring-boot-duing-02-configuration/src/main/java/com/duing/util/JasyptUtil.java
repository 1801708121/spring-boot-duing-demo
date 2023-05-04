package com.duing.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {

    public static void main(String[] args) {
        //加密器  每次加密都是不一样的结果
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("123456!@#");
        String username = encryptor.encrypt("root");
        String password = encryptor.encrypt("root123");
        System.out.println(username);
        System.out.println(password);
    }
}
