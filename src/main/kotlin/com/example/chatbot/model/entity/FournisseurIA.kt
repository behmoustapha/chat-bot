package com.example.chatbot.model.entity

import jakarta.persistence.*

@Entity
class FourniseurIA(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,

    @Column(nullable = false)
    var nom: String,

    var cheminLogo: String? = null,

    @Column(columnDefinition = "TEXT")
    var description: String? = null,

    // Association One-to-Many avec ModeleIA
    @OneToMany(mappedBy = "fourniseurIA", cascade = [CascadeType.ALL], orphanRemoval = true)
    var modelesIA: MutableList<ModeleIA> = mutableListOf()
)