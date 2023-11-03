package com.learningNewThings.controller;

import com.learningNewThings.dao.SubscriptionRepository;
import com.learningNewThings.service.MessageSubscriberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/messages/subscriber/{subscriberId}")
public class MessageSubscriberController {

    @Autowired
    private MessageSubscriberServiceImpl subscriptionService;

    @GetMapping("/subscriber/{subscriberId}")
    public List<Object[]> getMessagesBySubscriber(@PathVariable Long subscriberId) {
        return subscriptionService.getMessagesBySubscriber(subscriberId);
    }
}

