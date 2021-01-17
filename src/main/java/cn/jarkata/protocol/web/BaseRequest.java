package cn.jarkata.protocol.web;

import java.io.Serializable;

public class BaseRequest<T> implements Serializable {

    private String msgType;
    private T data;

    public String getMsgType() {
        return msgType;
    }

    public T getData() {
        return data;
    }

    public BaseRequest<T> setMsgType(String msgType) {
        this.msgType = msgType;
        return this;
    }

    public BaseRequest<T> setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer buffer = new StringBuffer("{");
        buffer.append("msgType='").append(msgType).append('\'');
        buffer.append(", data=").append(data);
        buffer.append('}');
        return buffer.toString();
    }
}
