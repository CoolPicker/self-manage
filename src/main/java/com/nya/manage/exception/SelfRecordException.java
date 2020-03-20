package com.nya.manage.exception;

/**
 * @Description 记录异常类
 * @Author nya
 * @Date 2020/3/20 下午1:56
 **/
public class SelfRecordException extends Exception {

    public SelfRecordException() {
    }

    public SelfRecordException(String message) {
        super(message);
    }

    public SelfRecordException(String message, Throwable cause) {
        super(message, cause);
    }
}
