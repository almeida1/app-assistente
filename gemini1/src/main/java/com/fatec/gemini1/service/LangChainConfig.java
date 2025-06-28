package com.fatec.gemini1.service;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LangChainConfig {

    @Bean
    ChatLanguageModel chatLanguageModel() {
        return OpenAiChatModel.builder()
                .apiKey("demo") // ou injete via variável de ambiente
                .modelName("gpt-4o-mini")
                .temperature(0.7)
                .logRequests(true)
                .logResponses(true)
                .build();
    }
}
