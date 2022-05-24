package com.saitej.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class CafeController {

    @ResponseBody
    @RequestMapping("/home")
    public  String getOrder(){
        return "this is cafe controller";
    }


    @RequestMapping("/order")
    public String showOrderPage(){

        return "order-page";
    }

    @RequestMapping("processOrder")
    public String processOrderPage(@RequestParam("order") String order, Model model){
        model.addAttribute("order",order);
        return "processOrder-page";
    }
}
