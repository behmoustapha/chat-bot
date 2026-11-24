package com.example.chatbot.model.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class Conversation(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,

    var titre: String? = null,

    var dateCreation: LocalDateTime = LocalDateTime.now(),

    // Association Many-to-One avec ModeleIA (maître de l'association)
    @ManyToOne
    @JoinColumn(name = "modele_ia_id")
    var modeleIA: ModeleIA? = null,

    // Association One-to-Many avec Message
    @OneToMany(mappedBy = "conversation", cascade = [CascadeType.ALL], orphanRemoval = true)
    var messages: MutableList<Message> = mutableListOf()
)