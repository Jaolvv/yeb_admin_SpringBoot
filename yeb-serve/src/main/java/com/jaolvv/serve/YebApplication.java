package com.jaolvv.serve;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @Author: Jaolvv
 * @Class: YebApplication
 * @Description: 启动类
 * @Date: Created in 4:59 PM 5/8/2022
 */

@SpringBootApplication
@MapperScan("com.jaolvv.serve.mapper")
public class YebApplication {
    public static void main(String[] args) {
        SpringApplication.run(YebApplication.class,args);
    }
}
