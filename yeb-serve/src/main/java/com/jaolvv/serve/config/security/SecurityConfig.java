package com.jaolvv.serve.config.security;

import com.jaolvv.serve.pojo.Admin;
import com.jaolvv.serve.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @Author: Jaolvv
 * @Class: SecurityConfig
 * @Description: Security配置类
 * @Date: Created in 4:03 PM 5/10/2022
 */
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    private IAdminService adminService;


    @Override
    @Bean
    public UserDetailsService userDetailsService(){
        return username -> {
            Admin admin = adminService.getAdminByUserName(username);
            if (null == admin){
                return admin;
            }
            return null;
        };
    }

}
