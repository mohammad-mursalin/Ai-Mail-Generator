package com.mursalin.spring_ai_demo.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    @Value("${gemini.api.key}")
    private String gemini_api_key;

    @Value("${gemini.api.url}")
    private String gemini_api_url;

    private final WebClient webClient;

    public ChatService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    public String generateReply(String message) {

    }
}
