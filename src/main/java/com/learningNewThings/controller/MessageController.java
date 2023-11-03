package com.learningNewThings.controller;

import com.learningNewThings.dao.MessageRepository;
import com.learningNewThings.entity.Message;
import com.learningNewThings.service.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageServiceImpl messageService;

    @GetMapping
    public List<Message> getAllMessages() {
        return messageService.getAllMessages();
    }

    @GetMapping("/messagesWithAuthors")
    public List<Object[]> getMessagesWithAuthors() {
        return messageService.findMessagesWithAuthors();
    }
}


