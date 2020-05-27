package com.fal.manager.service.impl;

import com.fal.manager.dao.DescriptionDao;
import com.fal.manager.entity.Description;
import com.fal.manager.service.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service注解一定不能忘记
@Service("descriptionService")
public class DescriptionServiceImpl implements DescriptionService {

    @Autowired
    private DescriptionDao descriptionDao;

    @Override
    public Description getLastDescription() {
        return descriptionDao.getLastDescription();
    }
}
