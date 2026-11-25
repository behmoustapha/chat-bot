package com.example.chatbot.model.dao

import com.example.chatbot.model.entity.Conversation
import org.springframework.data.jpa.repository.JpaRepository

interface ConversationDAO : JpaRepository<Conversation, Long> {
    fun findAllByOrderByDateDerniereModificationDesc(): List<Conversation>
}
