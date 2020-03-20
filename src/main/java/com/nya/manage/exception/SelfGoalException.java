package com.nya.manage.exception;

/**
 * @Description 目标异常类
 * @Author nya
 * @Date 2020/3/20 下午1:55
 **/
public class SelfGoalException extends Exception {

    public SelfGoalException() {
    }

    public SelfGoalException(String message) {
        super(message);
    }

    public SelfGoalException(String message, Throwable cause) {
        super(message, cause);
    }
}
