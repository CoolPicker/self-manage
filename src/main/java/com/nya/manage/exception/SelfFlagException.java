package com.nya.manage.exception;

/**
 * @Description flag异常类
 * @Author nya
 * @Date 2020/3/20 下午1:55
 **/
public class SelfFlagException extends Exception {

    public SelfFlagException() {
    }

    public SelfFlagException(String message) {
        super(message);
    }

    public SelfFlagException(String message, Throwable cause) {
        super(message, cause);
    }
}
