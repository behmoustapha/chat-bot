package com.example.chatbot.model.entity

import jakarta.persistence.*

@Entity
class ModeleIA(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,

    @Column(nullable = false)
    var nom: String,

    @Column(nullable = false)
    var urlAPI: String,

    @Column(columnDefinition = "TEXT")
    var description: String? = null,

    var cheminLogo: String? = null,

    // Association Many-to-One avec FourniseurIA (maître de l'association)
    @ManyToOne
    @JoinColumn(name = "fourniseur_ia_id")
    var fourniseurIA: FourniseurIA? = null,

    // Association One-to-Many avec Conversation
    @OneToMany(mappedBy = "modeleIA", cascade = [CascadeType.ALL], orphanRemoval = true)
    var conversations: MutableList<Conversation> = mutableListOf()
)