package com.jaolvv.serve.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jaolvv.serve.mapper.AdminMapper;
import com.jaolvv.serve.pojo.Admin;
import com.jaolvv.serve.service.IAdminService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Jaolvv
 * @since 2022-05-09
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
