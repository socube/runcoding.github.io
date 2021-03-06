package com.runcoding.controller;

import com.alibaba.fastjson.JSON;
import com.runcoding.model.po.account.AccountPo;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationController {


    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ApiOperation(value="进入系统应用主页", notes="默认跳转到swagger-ui")
    public String app(){
        return "redirect:/swagger-ui.html";
    }





}

