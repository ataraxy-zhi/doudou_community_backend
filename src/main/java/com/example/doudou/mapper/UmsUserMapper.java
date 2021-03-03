package com.example.doudou.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.doudou.model.entity.UmsUser;
import org.springframework.stereotype.Repository;

/**
 * 用户信息持久层映射接口
 */
@Repository
public interface UmsUserMapper extends BaseMapper<UmsUser> {
}
