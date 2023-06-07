package com.example.chath2.service;

import com.example.chath2.bo.MessagesBO;
import com.example.chath2.model.MessagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MesagesService {
    @Autowired
    private MessagesRepository messagesRepository;

    public MesagesService(MessagesRepository messagesRepository){
        this.messagesRepository = messagesRepository;
    }

    public List<MessagesBO> getAllMessages() {
        return messagesRepository.findAll();
    }

    public MessagesBO saveMessage(MessagesBO messagesBO) {
        messagesBO.setCreatedAt(new Date());
        return messagesRepository.save(messagesBO);
    }
}
