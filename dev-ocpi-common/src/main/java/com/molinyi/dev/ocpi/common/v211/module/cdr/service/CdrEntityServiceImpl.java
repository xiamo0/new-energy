package com.molinyi.dev.ocpi.common.v211.module.cdr.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.molinyi.dev.ocpi.common.v211.module.cdr.entity.CdrEntity;
import com.molinyi.dev.ocpi.common.v211.module.cdr.mapper.CdrEntityMapper;
import org.springframework.stereotype.Service;

@Service
public class CdrEntityServiceImpl extends ServiceImpl<CdrEntityMapper, CdrEntity> implements CdrEntityService {
}
