package com.jaolvv.serve.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jaolvv.serve.mapper.NationMapper;
import com.jaolvv.serve.pojo.Nation;
import com.jaolvv.serve.service.INationService;
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
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

}
