package com.fal.manager.service;

import com.fal.manager.entity.Description;

public interface DescriptionService {
    /**
     * 获取最新一条描述
     *
     * @return
     */
    Description getLastDescription();
}
