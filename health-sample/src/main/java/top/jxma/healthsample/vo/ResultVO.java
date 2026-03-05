package top.jxma.healthsample.vo;

import lombok.Data;

@Data
public class ResultVO<T> {
    private int code;
    private String msg;
    private T data;

    public static <T> ResultVO<T> success(T data) {
        ResultVO<T> result = new ResultVO<>();
        result.setCode(200);
        result.setMsg("success");
        result.setData(data);
        return result;
    }

    public static <T> ResultVO<T> fail(int code, String msg) {
        ResultVO<T> result = new ResultVO<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }
}