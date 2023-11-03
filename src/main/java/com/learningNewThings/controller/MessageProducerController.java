package com.learningNewThings.controller;

import com.learningNewThings.dao.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-11-02,Nov,2023
 * in Project: userManagementService
 */
@RestController
@RequestMapping("/api/messages/producer/{producerId}")
public class MessageProducerController {

    @Autowired
    private MessageRepository messageRepository;

    @GetMapping
    public List<Object[]> getMessagesByProducer(@PathVariable Long producerId) {
        return messageRepository.findMessagesWithAuthors();
    }
}

