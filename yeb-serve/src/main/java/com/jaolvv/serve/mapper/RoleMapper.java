package com.jaolvv.serve.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jaolvv.serve.pojo.Role;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Jaolvv
 * @since 2022-05-09
 */
public interface RoleMapper extends BaseMapper<Role> {

    List<Role> getRoles(Integer adminId);
}
