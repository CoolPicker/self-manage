package com.nya.manage.entity;

import com.alibaba.fastjson.JSONObject;

/**
 * 接口返回统一封装类
 * @Author: nya
 * @Date: 18-6-22 上午9:31
 */
public class ResponseData {

    private final String message;
    private final int code;
    private final JSONObject data = new JSONObject();

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    public JSONObject getData() {
        return data;
    }

    public ResponseData(int code , String message) {
        this.message = message;
        this.code = code;
    }

    public ResponseData putDataValue(String key , Object value) {
        data.put(key,value);
        return this;
    }

    public static ResponseData ok() {
        return new ResponseData(200, "Ok");
    }

    public static ResponseData notFound() {
        return new ResponseData(404, "Not Found");
    }

    public static ResponseData badRequest() {
        return new ResponseData(400, "Bad Request");
    }

    public static ResponseData forbidden() {
        return new ResponseData(403, "Forbidden");
    }

    public static ResponseData unauthorized() {
        return new ResponseData(401, "unauthorized");
    }

    public static ResponseData serverInternalError() {
        return new ResponseData(500, "Server Internal Error");
    }

    public static ResponseData customerError() {
        return new ResponseData(1001, "Customer Error");
    }
}
