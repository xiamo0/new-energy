package com.molinyi.dev.ocpi.common.v211.module.location.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.molinyi.dev.ocpi.common.v211.module.location.entity.LocationEntity;
import com.molinyi.dev.ocpi.common.v211.module.location.mapper.LocationEntityMapper;
import org.springframework.stereotype.Service;

@Service
public class LocationEntityServiceImpl extends ServiceImpl<LocationEntityMapper, LocationEntity> implements LocationEntityService {
}
