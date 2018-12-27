package com.mwb.mapper;

import com.mwb.bean.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by admin on 2018/12/27.
 */
@Mapper
public interface SysUserMapper {
    public List<SysUser> findAll();
}
