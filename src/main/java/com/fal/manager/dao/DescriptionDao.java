package com.fal.manager.dao;

import com.fal.manager.entity.Description;

public interface DescriptionDao {
    /**
     * 获取最新一条描述
     *
     * @return
     */
    Description getLastDescription();
}
