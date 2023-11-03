package com.learningNewThings.dao;

import com.learningNewThings.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    @Query("SELECT m, u.username AS author FROM messages m JOIN User u ON m.user = u")
    List<Object[]> findMessagesWithAuthors();
}
