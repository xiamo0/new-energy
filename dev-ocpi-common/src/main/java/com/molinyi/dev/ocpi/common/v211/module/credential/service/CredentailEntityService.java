package com.molinyi.dev.ocpi.common.v211.module.credential.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.molinyi.dev.ocpi.common.v211.module.credential.entity.CredentailEntity;
import lombok.NonNull;

public interface CredentailEntityService extends IService<CredentailEntity> {

    CredentailEntity getByToken(@NonNull String token);
}
