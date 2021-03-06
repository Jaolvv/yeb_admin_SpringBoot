package com.jaolvv.serve.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jaolvv.serve.pojo.MenuRole;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Jaolvv
 * @since 2022-05-09
 */
public interface MenuRoleMapper extends BaseMapper<MenuRole> {

    Integer insertRecord(Integer rid, Integer[] mids);
}
