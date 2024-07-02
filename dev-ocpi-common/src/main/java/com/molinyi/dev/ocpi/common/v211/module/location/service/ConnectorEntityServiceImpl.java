package com.molinyi.dev.ocpi.common.v211.module.location.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.molinyi.dev.ocpi.common.v211.module.location.entity.ConnectorEntity;
import com.molinyi.dev.ocpi.common.v211.module.location.mapper.ConnectorEntityMapper;
import org.springframework.stereotype.Service;

@Service
public class ConnectorEntityServiceImpl extends ServiceImpl<ConnectorEntityMapper, ConnectorEntity> implements ConnectorEntityService {
}
