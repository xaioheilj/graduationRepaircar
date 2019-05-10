package com.graduationdesign.lj.springboot.pojo;

import java.io.Serializable;
@SuppressWarnings("serial")
public class DefaultResp<E> implements Serializable {

    private String code;
    private String msg;
    private E data;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }



    public DefaultResp() {
    }

    public DefaultResp(String code, String msg, E data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
