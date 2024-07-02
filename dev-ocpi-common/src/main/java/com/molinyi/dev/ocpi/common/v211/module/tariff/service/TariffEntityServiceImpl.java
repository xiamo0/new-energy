package com.molinyi.dev.ocpi.common.v211.module.tariff.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.molinyi.dev.ocpi.common.v211.module.tariff.entity.TariffEntity;
import com.molinyi.dev.ocpi.common.v211.module.tariff.mapper.TariffEntityMapper;
import org.springframework.stereotype.Service;

@Service
public class TariffEntityServiceImpl extends ServiceImpl<TariffEntityMapper, TariffEntity> implements TariffEntityService {
}
