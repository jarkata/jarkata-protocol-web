package cn.jarkata.protocol.web;

import java.io.Serializable;

public class BaseResponse implements Serializable {
    private String code;
    private String message;
    private Object data;

    public BaseResponse() {
    }

    public BaseResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static BaseResponse success() {
        return new BaseResponse("0", "success");
    }

    public static BaseResponse fail(String code, String message) {
        return new BaseResponse(code, message);
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }

    public BaseResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public BaseResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public BaseResponse setData(Object data) {
        this.data = data;
        return this;
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
