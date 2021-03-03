package com.example.doudou.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.doudou.model.entity.BmsTip;

/**
 * “每日一句”服务层接口
 */
public interface IBmsTipService extends IService<BmsTip> {
    // 随机得到一句
    BmsTip getRandomTip();
}
