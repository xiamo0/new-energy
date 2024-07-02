package com.molinyi.dev.ocpi.common.v211.module.session.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.molinyi.dev.ocpi.common.v211.module.session.entity.SessionEntity;
import com.molinyi.dev.ocpi.common.v211.module.session.mapper.SessionEntityMapper;
import org.springframework.stereotype.Service;

@Service
public class SessionEntityServiceImpl extends ServiceImpl<SessionEntityMapper, SessionEntity> implements SessionEntityService {

}
