package com.example.doudou.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.doudou.model.entity.BmsTip;
import org.springframework.stereotype.Repository;

/**
 * “每日一句”数据库映射接口
 */
@Repository
public interface BmsTipMapper extends BaseMapper<BmsTip> {
    // 随机查询一条 SELECT * FROM `bms_post` ORDER BY RAND() LIMIT 1;
    BmsTip getRandomTip();
}
