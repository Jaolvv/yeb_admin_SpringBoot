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

    /**
     * 根据用户id查询角色列表
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);
}


