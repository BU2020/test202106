package com.zhengzhou.crm.exception;

public class LoginException extends Exception{
    public LoginException() {
        super();
    }

    public LoginException(String msg){
        super(msg);
    }
}
