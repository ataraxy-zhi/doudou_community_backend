package com.example.doudou.controller;

import com.example.doudou.common.api.ApiResult;
import com.example.doudou.model.entity.BmsTip;
import com.example.doudou.service.IBmsTipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName BmsTipController
 * @Description "每日一句"控制器
 * @Author
 * @Date 2021/3/3 15:09
 */
@RestController
@RequestMapping("/tip")
public class BmsTipController extends BaseController {

    @Resource
    private IBmsTipService bmsTipService;

    @GetMapping("/today")
    public ApiResult<BmsTip> getRandomTip() {
        BmsTip tip = bmsTipService.getRandomTip();
        return ApiResult.success(tip);
    }
}
