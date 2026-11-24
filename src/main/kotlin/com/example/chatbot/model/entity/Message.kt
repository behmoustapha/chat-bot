package com.example.chatbot.model.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class Message(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,

    @Column(columnDefinition = "TEXT", nullable = false)
    var contenu: String,

    var dateCreation: LocalDateTime = LocalDateTime.now(),

    @Enumerated(EnumType.STRING)
    var typeMessage: TypeMessage,

    // Association Many-to-One avec Conversation (maître de l'association)
    @ManyToOne
    @JoinColumn(name = "conversation_id")
    var conversation: Conversation? = null
)