package com.knight.pojo;

/**
 * Created by forget on 2020/9/23.
 */
public class AjaxResponse {

    private Integer code;

    private String msg;

    private Object data;

    public AjaxResponse() {
        this(200,"SUCCESS",null);
    }

    public AjaxResponse(Integer code, String msg) {
        this(code,msg,null);
    }

    public AjaxResponse(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
