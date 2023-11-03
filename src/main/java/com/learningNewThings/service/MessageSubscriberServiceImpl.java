package com.learningNewThings.service;

import com.learningNewThings.dao.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-11-03,Nov,2023
 * in Project: LearningSpringBoot
 */

@Service
public abstract class MessageSubscriberServiceImpl implements SubscriptionRepository {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Override
    public List<Object[]> getMessagesBySubscriber(Long subscriberId) {
        return subscriptionRepository.findMessagesBySubscriber(subscriberId);
    }
}

