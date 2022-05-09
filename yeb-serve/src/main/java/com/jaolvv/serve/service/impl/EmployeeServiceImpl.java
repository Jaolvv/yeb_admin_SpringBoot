package com.jaolvv.serve.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jaolvv.serve.mapper.EmployeeMapper;
import com.jaolvv.serve.pojo.Employee;
import com.jaolvv.serve.service.IEmployeeService;
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
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
