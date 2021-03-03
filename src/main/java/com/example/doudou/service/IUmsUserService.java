package com.example.doudou.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.doudou.model.dto.RegisterDTO;
import com.example.doudou.model.entity.UmsUser;

/**
 * 用户信息服务层接口
 */
public interface IUmsUserService extends IService<UmsUser> {

    /**
     * 注册功能
     *
     * @param dto
     * @return 注册对象
     */
    UmsUser executeRegister(RegisterDTO dto);
}
