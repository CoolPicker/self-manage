package com.nya.manage.exception;

/**
 * @Description 日志异常类
 * @Author nya
 * @Date 2020/3/20 下午1:55
 **/
public class SelfDiaryException extends Exception {

    public SelfDiaryException() {
    }

    public SelfDiaryException(String message) {
        super(message);
    }

    public SelfDiaryException(String message, Throwable cause) {
        super(message, cause);
    }
}
