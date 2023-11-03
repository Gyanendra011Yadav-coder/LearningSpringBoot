package com.learningNewThings.service;

import com.learningNewThings.dao.MessageRepository;
import com.learningNewThings.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-11-03,Nov,2023
 * in Project: LearningSpringBoot
 */
@Service
public abstract class MessageServiceImpl implements MessageRepository {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    @Override
    public List<Object[]> findMessagesWithAuthors() {
        return messageRepository.findMessagesWithAuthors();
    }
}

