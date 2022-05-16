package com.jaolvv.serve.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jaolvv.serve.pojo.MenuRole;
import com.jaolvv.serve.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Jaolvv
 * @since 2022-05-09
 */
public interface IMenuRoleService extends IService<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
