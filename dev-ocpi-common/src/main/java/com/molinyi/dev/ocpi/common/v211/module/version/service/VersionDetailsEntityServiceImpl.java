package com.molinyi.dev.ocpi.common.v211.module.version.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.molinyi.dev.ocpi.common.v211.module.version.entity.VersionDetailsEntity;
import com.molinyi.dev.ocpi.common.v211.module.version.mapper.VersionDetailsEntityMapper;
import org.springframework.stereotype.Service;

@Service
public class VersionDetailsEntityServiceImpl extends ServiceImpl<VersionDetailsEntityMapper, VersionDetailsEntity> implements VersionDetailsEntityService {


}
