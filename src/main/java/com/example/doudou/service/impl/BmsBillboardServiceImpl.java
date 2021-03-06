package com.example.doudou.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.doudou.mapper.BmsBillboardMapper;
import com.example.doudou.model.entity.BmsBillboard;
import com.example.doudou.service.IBmsBillboardService;
import org.springframework.stereotype.Service;

/**
 * 公告板服务类
 */
@Service
public class BmsBillboardServiceImpl extends ServiceImpl<BmsBillboardMapper,
        BmsBillboard> implements IBmsBillboardService {
}
