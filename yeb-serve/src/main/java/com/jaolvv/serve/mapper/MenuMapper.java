package com.jaolvv.serve.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jaolvv.serve.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Jaolvv
 * @since 2022-05-09
 */
public interface MenuMapper extends BaseMapper<Menu> {

    /**
     * 根据用户id查询菜单列表
     * @param id
     * @return
     */
    List<Menu> getMenusByAdminId(byte[] id);

    /**
     * 根据角色获取菜单列表
     * @return
     */
    List<Menu> getMenusWithRole();

    /**
     * 查询所有菜单
     * @return
     */
    List<Menu> getAllMenus();
}
