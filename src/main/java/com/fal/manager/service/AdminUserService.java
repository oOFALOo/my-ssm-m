package com.fal.manager.service;

import com.fal.manager.entity.AdminUser;
import com.fal.manager.utils.PageResult;
import com.fal.manager.utils.PageUtil;

public interface AdminUserService {

    PageResult getAdminUserPage(PageUtil pageUtil);

    /**
     * 登陆功能
     *
     * @return
     */
    AdminUser updateTokenAndLogin(String userName, String password);

    /**
     * 根据userToken获取用户记录
     *
     * @return
     */
    AdminUser getAdminUserByToken(String userToken);

    /**
     * 根据id获取用户记录
     *
     * @return
     */
    AdminUser selectById(Long id);

    /**
     * 根据用户名获取用户记录
     *
     * @return
     */
    AdminUser selectByUserName(String userName);

    /**
     * 新增用户记录
     *
     * @return
     */
    int save(AdminUser user);

    /**
     * 修改密码
     *
     * @return
     */
    int updatePassword(AdminUser user);
}
