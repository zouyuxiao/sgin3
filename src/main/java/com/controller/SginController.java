package com.controller;

import com.bean.Sign;
import com.service.SginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by ${邹} on 2019/2/25.
 * 描述：
 */
@Controller
@RequestMapping("/sgin")
public class SginController {
    @Autowired
    private SginService sginService;
    @RequestMapping("/insert/{uId}")
    public String insert(Model model, @PathVariable long uId, Sign sign){
        sign.setTime( new Date() );
        sign.setuId( uId );
        sginService.insert( sign );
        model.addAttribute( "msg","打卡成功" );
        return "success";
    }
}
