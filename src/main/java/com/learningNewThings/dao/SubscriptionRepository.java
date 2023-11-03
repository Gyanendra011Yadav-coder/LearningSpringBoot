package com.learningNewThings.dao;

import com.learningNewThings.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-11-02,Nov,2023
 * in Project: LearningSpringBoot
 */
public interface SubscriptionRepository extends JpaRepository<Message, Long> {
    @Query("SELECT m, u.username AS author FROM Message m " +
            "JOIN User u ON m.user.userId = u.userId " +
            "JOIN Subscription s ON u.userId = s.producer.userId " +
            "WHERE s.subscriber.userId = ?1")
    List<Object[]> findMessagesBySubscriber(Long subscriberId);
}
