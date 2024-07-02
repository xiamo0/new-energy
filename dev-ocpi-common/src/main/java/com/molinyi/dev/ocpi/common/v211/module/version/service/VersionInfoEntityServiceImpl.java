package com.molinyi.dev.ocpi.common.v211.module.version.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.molinyi.dev.ocpi.common.v211.module.version.entity.VersionInfoEntity;
import com.molinyi.dev.ocpi.common.v211.module.version.mapper.VersionInfoEntityMapper;
import org.springframework.stereotype.Service;

@Service
public class VersionInfoEntityServiceImpl extends ServiceImpl<VersionInfoEntityMapper, VersionInfoEntity> implements VersionInfoEntityService {

}
