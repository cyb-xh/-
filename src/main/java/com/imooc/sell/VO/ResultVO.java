package com.imooc.sell.VO;


import lombok.Data;
import org.springframework.stereotype.Component;

/**
* @Title: ResultVO
* @Package com.imooc.sell.VO
* @Description: http请求返回的最外层对象
* @date 2020/4/15
* @version V1.0
*/
@Data
public class ResultVO<T> {
    //错误码
    private Integer code;

    //提示信息
    private String msg;

    //具体内容
    private T data;
}
