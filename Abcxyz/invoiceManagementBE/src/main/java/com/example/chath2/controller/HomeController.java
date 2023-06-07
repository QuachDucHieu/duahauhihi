package com.example.chath2.controller;

import com.example.chath2.bo.MessagesBO;
import com.example.chath2.common.Response;
import com.example.chath2.service.MesagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class HomeController {
    @Autowired
    MesagesService mesagesService;
    @GetMapping( "/home")
    public Response getAllMessages() {
        return Response.success().withData(mesagesService.getAllMessages());
//        return (mesagesService.getAllMessages());
    }

}
