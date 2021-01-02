package cn.jarkata.protocol.web;

import java.io.Serializable;

public class BaseResponse implements Serializable {
    private String code;
    private String message;
    private Object data;

    public BaseResponse() {
        this.code = "0";
        this.message = "success";
    }

    public BaseResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuffer buffer = new StringBuffer("{");
        buffer.append("code='").append(code).append('\'');
        buffer.append(", message='").append(message).append('\'');
        buffer.append(", data=").append(data);
        buffer.append('}');
        return buffer.toString();
    }
}
