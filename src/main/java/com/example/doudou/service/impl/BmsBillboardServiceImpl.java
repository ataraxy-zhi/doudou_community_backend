package com.example.doudou.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.doudou.mapper.IBmsBillboardMapper;
import com.example.doudou.model.entity.BmsBillboard;
import com.example.doudou.service.IBmsBillboardService;
import org.springframework.stereotype.Service;

@Service
public class BmsBillboardServiceImpl extends ServiceImpl<IBmsBillboardMapper,
        BmsBillboard> implements IBmsBillboardService {
}
