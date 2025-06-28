package com.fatec.gemini1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.gemini1.service.Assistant;

import dev.langchain4j.model.chat.ChatLanguageModel;

@RestController
@RequestMapping("/api")
public class LangChainController {

    @Autowired
    ChatLanguageModel chatLanguageModel;

    @Autowired
    Assistant assistant;

    @PostMapping("/chat-bot")
    public String chatBot(@RequestBody String message) {
        return chatLanguageModel.generate(message);
    }

    @PostMapping("/assistant")
    public String assistant(@RequestBody String message) {
    	System.out.println(">>>>>>  assistente");
        return assistant.chat(message);
    }

}