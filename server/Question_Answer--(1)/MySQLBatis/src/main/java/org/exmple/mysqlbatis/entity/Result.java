package org.exmple.mysqlbatis.entity;

import lombok.Data;

@Data
public class Result {
    private Integer code;
    private String msg;
    private Object data;
    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result() {
    }

    public static Result success(){
    return new Result(200,"success",null);
    }

    public static Result success(Object data){
        return new Result(200,"success",data);
    }

    public static Result error(String str){
        return new Result(0,str,null);
    }
}
