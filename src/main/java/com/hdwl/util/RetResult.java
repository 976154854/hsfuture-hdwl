package com.hdwl.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.annotation.JSONField;
import io.jsonwebtoken.lang.Assert;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class RetResult<T> {
    @JSONField(
            ordinal = 1
    )
    private int code;
    @JSONField(
            ordinal = 2
    )
    private String status;
    @JSONField(
            ordinal = 3
    )
    private Map<String, Object> message;
    @JSONField(
            ordinal = 4
    )
    private T data;
    @JSONField(
            ordinal = 5
    )
    private long timestamp;

    private RetResult() {
    }

    public static RetResult error() {
        return error("fail");
    }

    public static RetResult error(String message) {
        HashMap map = new HashMap(16);
        map.put("default", message);
        return error((Map)map);
    }

    public static RetResult error(Map<String, Object> message) {
        return error((Integer)null, (Map)message);
    }

    public static RetResult error(Integer code, String message) {
        HashMap map = new HashMap(16);
        map.put("default", message);
        return error(code, (Map)map);
    }

    public static RetResult error(Integer code, Map<String, Object> message) {
        if(code == null) {
            code = Integer.valueOf(500);
        }

        if(message == null) {
            message = new HashMap(16);
            ((Map)message).put("default", "操作失败.");
        }

        return build(code.intValue(), "fail", (Map)message);
    }

    public static RetResult ok() {
        return ok("操作成功.");
    }

    public static RetResult ok(String message) {
        HashMap map = new HashMap(16);
        map.put("default", message);
        return ok((Map)map);
    }

    public static RetResult ok(Map<String, Object> message) {
        return ok((Integer)null, message);
    }

    public static RetResult ok(Integer code, Map<String, Object> message) {
        if(code == null) {
            code = Integer.valueOf(200);
        }

        if(message == null) {
            message = new HashMap(16);
            ((Map)message).put("default", "操作成功.");
        }

        return build(code.intValue(), "success", (Map)message);
    }

    public static RetResult build(int code, String status, Map<String, Object> message) {
        return (new RetResult()).setCode(code).setStatus(status).setMessage(message).setTimestamp(System.currentTimeMillis());
    }

    public String toString() {
        return JSON.toJSONString(this, true);
    }

    public static RetResult convert(String jsonString) throws IllegalArgumentException {
        Assert.hasLength(jsonString, "jsonString is null or empty");

        try {
            return (RetResult)JSON.parseObject(jsonString, RetResult.class);
        } catch (Exception var2) {
            throw new IllegalArgumentException("jsonString did not comply with the format");
        }
    }

    public static Object convertData(Object data, Class classType) throws IllegalArgumentException {
        try {
            return JSON.parseObject(JSON.toJSONString(data), classType);
        } catch (Exception var3) {
            throw new IllegalArgumentException("jsonString did not comply with the format");
        }
    }

    public static List convertDataArray(Object data, Class clazz) throws IllegalArgumentException {
        try {
            return JSONArray.parseArray(JSON.toJSONString(data), clazz);
        } catch (Exception var3) {
            throw new IllegalArgumentException("jsonString did not comply with the format");
        }
    }

    public RetResult setCode(int code) {
        this.code = code;
        return this;
    }

    public RetResult setStatus(String status) {
        this.status = status;
        return this;
    }

    public RetResult setMessage(Map<String, Object> message) {
        this.message = message;
        return this;
    }

    public RetResult setData(T data) {
        this.data = data;
        return this;
    }

    public RetResult setTimestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public boolean isStatus() {
        return !StringUtils.isBlank(this.status) && !"fail".equals(this.status);
    }

    public int getCode() {
        return this.code;
    }

    public String getStatus() {
        return this.status;
    }

    public Map<String, Object> getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

    public long getTimestamp() {
        return this.timestamp;
    }
}