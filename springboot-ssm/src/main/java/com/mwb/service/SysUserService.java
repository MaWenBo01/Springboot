package com.mwb.service;

import com.mwb.bean.SysUser;

import java.util.List;

/**
 * Created by admin on 2018/12/27.
 */
public interface SysUserService {
    /**
     * 根据接口查询所用的用户
    */
    public List<SysUser> findAllUser();
}
