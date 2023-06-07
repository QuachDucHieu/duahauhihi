package com.example.chath2.common;
import com.example.chath2.common.Constants;
public class Response {
    private Object data;
    private String type;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Response(String type) {
        this.type = type;
    }

    public static Response success() {
        return new Response(Constants.RESPONSE_TYPE.SUCCESS);
    }

    public Response withData(Object data) {
        this.data = data;
        return this;
    }
}
