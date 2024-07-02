package com.molinyi.dev.ocpi.common.v211.module.location.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.molinyi.dev.ocpi.common.v211.module.location.entity.EvseEntity;
import com.molinyi.dev.ocpi.common.v211.module.location.mapper.EvseEntityMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EvseEntityServiceImpl extends ServiceImpl<EvseEntityMapper, EvseEntity> implements EvseEntityService {
}

