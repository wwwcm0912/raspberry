package com.github.xm.raspberry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("addProduct")
    public String addProduct(){
        return "addProduct";
    }

    @RequestMapping("productManagement")
    public String productManagement(){
        return "productManagement";
    }

    @RequestMapping("updateProduct")
    public String updateProduct(){
        return "updateProduct";
    }
}
