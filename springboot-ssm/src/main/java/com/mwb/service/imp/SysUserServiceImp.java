package com.mwb.service.imp;

import com.mwb.bean.SysUser;
import com.mwb.mapper.SysUserMapper;
import com.mwb.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2018/12/27.
 */
@Service
public class SysUserServiceImp implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAllUser() {
        List<SysUser> list= sysUserMapper.findAll();
        return list;
    }
}
