package com.example.springbootsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    // メニュー画面表示
    @GetMapping("/menu")
    public String personMenu() {
        return "menu";
    }
}
