package com.learningNewThings.controller;

import com.learningNewThings.dao.SubscriptionRepository;
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
@RequestMapping("/api/messages/subscriber/{subscriberId}")
public class MessageSubscriberController {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @GetMapping("/subscriber/{subscriberId}")
    public List<Object[]> getMessagesBySubscriber(@PathVariable Long subscriberId) {
        return subscriptionRepository.findMessagesBySubscriber(subscriberId);
    }
}

