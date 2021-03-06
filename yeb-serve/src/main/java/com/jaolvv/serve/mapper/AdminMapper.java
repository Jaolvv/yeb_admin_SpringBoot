package com.jaolvv.serve.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jaolvv.serve.pojo.Admin;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Jaolvv
 * @since 2022-05-09
 */
public interface AdminMapper extends BaseMapper<Admin> {

    List<Admin> getAllAdmins(byte[] id, String keywords);
}
