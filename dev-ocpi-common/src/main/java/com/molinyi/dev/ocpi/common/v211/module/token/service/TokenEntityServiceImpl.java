package com.molinyi.dev.ocpi.common.v211.module.token.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.molinyi.dev.ocpi.common.v211.module.token.entity.TokenEntity;
import com.molinyi.dev.ocpi.common.v211.module.token.mapper.TokenEntityMapper;
import org.springframework.stereotype.Service;

@Service
public class TokenEntityServiceImpl extends ServiceImpl<TokenEntityMapper, TokenEntity> implements TokenEntityService {
}
