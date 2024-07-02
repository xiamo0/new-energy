package com.molinyi.dev.ocpi.common.v211.module.credential.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.molinyi.dev.ocpi.common.v211.module.credential.entity.BusinessDetailsEntity;
import com.molinyi.dev.ocpi.common.v211.module.credential.mapper.BusinessDetailsEntityMapper;
import org.springframework.stereotype.Service;

@Service
public class BusinessDetailsEntityServiceImpl extends ServiceImpl<BusinessDetailsEntityMapper, BusinessDetailsEntity> implements BusinessDetailsEntityService {
}
