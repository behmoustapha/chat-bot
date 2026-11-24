package com.example.chatbot.model.dao

import com.example.chatbot.model.entity.Message
import org.springframework.data.jpa.repository.JpaRepository

interface MessageDAO : JpaRepository<Message, Long>