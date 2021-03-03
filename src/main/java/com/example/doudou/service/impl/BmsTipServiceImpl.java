package com.example.doudou.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.doudou.mapper.IBmsTipMapper;
import com.example.doudou.model.entity.BmsTip;
import com.example.doudou.service.IBmsTipService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ClassName BmsTipServiceImpl
 * @Description "每日一句"服务层对象
 * @Author
 * @Date 2021/3/3 15:02
 */
@Slf4j
@Service
public class BmsTipServiceImpl extends ServiceImpl<IBmsTipMapper
        , BmsTip> implements IBmsTipService {

    @Override
    public BmsTip getRandomTip() {
        BmsTip todayTip = null;
        try {
            todayTip = this.baseMapper.getRandomTip();
        } catch (Exception e) {
            log.info("tip转化失败");
        }

        return todayTip;
    }
}
