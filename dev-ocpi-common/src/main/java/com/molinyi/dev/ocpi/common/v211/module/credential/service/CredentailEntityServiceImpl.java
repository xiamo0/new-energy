package com.molinyi.dev.ocpi.common.v211.module.credential.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.molinyi.dev.ocpi.common.v211.module.credential.entity.CredentailEntity;
import com.molinyi.dev.ocpi.common.v211.module.credential.mapper.CredentailEntityMapper;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class CredentailEntityServiceImpl extends ServiceImpl<CredentailEntityMapper, CredentailEntity> implements CredentailEntityService {
    @Override
    public CredentailEntity getByToken(@NonNull String token) {
        final LambdaQueryWrapper<CredentailEntity> wrapper = Wrappers.lambdaQuery(CredentailEntity.class).eq(CredentailEntity::getToken, token);
        return this.getOne(wrapper);
    }


}
