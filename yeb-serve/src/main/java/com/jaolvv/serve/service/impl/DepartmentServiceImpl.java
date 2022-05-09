package com.jaolvv.serve.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jaolvv.serve.mapper.DepartmentMapper;
import com.jaolvv.serve.pojo.Department;
import com.jaolvv.serve.service.IDepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
