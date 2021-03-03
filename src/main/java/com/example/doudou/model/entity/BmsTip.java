package com.example.doudou.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName BmsTip
 * @Description “每日一句”对象
 * @Author
 * @Date 2021/3/3 14:44
 */
@Data
@NoArgsConstructor
@TableName("bms_tip")
public class BmsTip implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 内容
     */
    @TableField("`content`")
    private String content;

    /**
     * 作者
     */
    private String author;

    /**
     * 1：使用，0：过期
     */
    private boolean type;
}
