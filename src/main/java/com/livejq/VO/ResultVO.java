package com.livejq.VO;

import lombok.Data;

/**
 * 描述:
 * http请求返回的最外层对象
 * Created by livejq
 * 2019-06-07 23:55
 **/
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
