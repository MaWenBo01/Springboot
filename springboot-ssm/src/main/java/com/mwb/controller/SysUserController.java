package com.mwb.controller;

import com.mwb.bean.SysUser;
import com.mwb.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by admin on 2018/12/27.
 */
@RestController /** 自动返回的数据json格式 **/
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;
    @RequestMapping(value = "getSysUserList")
    public List<SysUser> getSysUserList(){
        List<SysUser> list =sysUserService.findAllUser();
        return list;
    }
}

