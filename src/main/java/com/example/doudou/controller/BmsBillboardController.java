package com.example.doudou.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.doudou.common.api.ApiResult;
import com.example.doudou.model.entity.BmsBillboard;
import com.example.doudou.service.IBmsBillboardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 公告板控制器
 */
@RestController
@RequestMapping("/billboard")
public class BmsBillboardController extends BaseController {

    /**
     * 公告板服务层对象
     */
    @Resource
    public IBmsBillboardService bmsBillboardService;

    /**
     * 获得最新显示通知
     *
     * @return
     */
    @GetMapping("/show")
    public ApiResult<BmsBillboard> getNotices() {
        List<BmsBillboard> list = bmsBillboardService.list(
                new LambdaQueryWrapper<BmsBillboard>().eq(BmsBillboard::isShow, true));
        return ApiResult.success(list.get(list.size() - 1));
    }

}
