package com.nya.manage.constant;

/**
 * @Description 常量类
 * @Author nya
 * @Date 2020/3/20 下午2:11
 **/
public class SelfManagementConstants {

    // 用户状态
    public static final Integer USER_STATUS_OK = 0;     // 正常
    public static final Integer USER_STATUS_PAUSE = 1;  // 暂停
    public static final Integer USER_STATUS_ERROR = 2;  // 异常,待后台处理
    public static final Integer USER_STATUS_BUDDHA = 3; // 佛系
    public static final Integer USER_STATUS_MOTIVATED = 4; // 打鸡血

    // 注册
    public static final Integer USERNAME_EXIST = 1111111111; // 用户名已存在


    // 本地路径
    public static final String LOCAL_PATH = "/data/nya/images/";
    // http头
    public static final String URL_PATH = "http://172.18.30.78:8089/";
}
