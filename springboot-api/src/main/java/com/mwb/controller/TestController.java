package com.mwb.controller;

import com.mwb.helper.CommonMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by admin on 2018/12/27.
 */
@RestController
@RequestMapping("/test")

public class TestController {
/**
 * 测试获取时间
 * @return
*/
@RequestMapping(value = "/getDate",method = RequestMethod.GET)
    public String getDate(){
    Date d= CommonMethod.getCurDate();
    SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    return "当前时间："+df.format(d);
}

}
