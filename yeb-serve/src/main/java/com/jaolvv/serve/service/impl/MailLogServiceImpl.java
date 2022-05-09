package com.jaolvv.serve.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jaolvv.serve.mapper.MailLogMapper;
import com.jaolvv.serve.pojo.MailLog;
import com.jaolvv.serve.service.IMailLogService;
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
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
