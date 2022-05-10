package com.jaolvv.serve.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Jaolvv
 * @Class: RespBean
 * @Description: 公共返回对象
 * @Date: Created in 2:45 PM 5/10/2022
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespBean {
    private long code;
    private String message;
    private Object object;

    /**
     * 成功返回结果
     * @param message
     * @return
     */
    public static RespBean success(String message){
        return new RespBean(200,message,null);
    }

    /**
     * 成功返回结果
     * @param message
     * @return
     */
    public static RespBean success(String message, Object obj){
        return new RespBean(200,message,obj);
    }

    /**
     * 失败返回结果
     * @param message
     * @return
     */
    public static RespBean error(String message){
        return new RespBean(500,message,null);
    }

    /**
     * 失败返回结果
     * @param message
     * @param obj
     * @return
     */
    public static RespBean error(String message,Object obj){
        return new RespBean(500,message,obj);
    }

}