package com.example.chath2.controller;

import com.example.chath2.bo.MessagesBO;
import com.example.chath2.service.MesagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    MesagesService mesagesService;
    @RequestMapping("home")
    public List<MessagesBO> getAllMessages() {
        return mesagesService.getAllMessages();
    }

//    @PostMapping
//    public Me
}
