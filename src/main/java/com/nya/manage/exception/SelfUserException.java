package com.nya.manage.exception;

/**
 * @Description 用户异常类
 * @Author nya
 * @Date 2020/3/20 下午1:55
 **/
public class SelfUserException extends Exception {

    public SelfUserException() {
    }

    public SelfUserException(String message) {
        super(message);
    }

    public SelfUserException(String message, Throwable cause) {
        super(message, cause);
    }
}
