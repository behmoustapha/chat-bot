package com.example.chatbot.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {

//    @GetMapping("/")
//    fun accueil(): String {
//        return "utilisateur/acceuil"
//    }
//
    @GetMapping("/connexion")
    fun connexion(): String {
        return "auth/connexion"
    }

}