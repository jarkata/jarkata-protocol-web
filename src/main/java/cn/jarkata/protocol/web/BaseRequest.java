package cn.jarkata.protocol.web;

import java.io.Serializable;

public class BaseRequest<T> implements Serializable {

    private String msgType;
    private T data;

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
