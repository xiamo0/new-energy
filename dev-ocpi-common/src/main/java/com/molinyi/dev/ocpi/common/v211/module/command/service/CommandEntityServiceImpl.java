package com.molinyi.dev.ocpi.common.v211.module.command.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.molinyi.dev.ocpi.common.v211.module.command.entity.CommandEntity;
import com.molinyi.dev.ocpi.common.v211.module.command.mapper.CommandEntityMapper;
import org.springframework.stereotype.Service;

@Service
public class CommandEntityServiceImpl extends ServiceImpl<CommandEntityMapper, CommandEntity> implements CommandEntityService {
}
