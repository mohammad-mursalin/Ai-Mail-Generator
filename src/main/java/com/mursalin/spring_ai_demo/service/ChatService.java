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
        Map<String, Object> requestBody = Map.of("contents", new Object[] {
                Map.of("parts", new Object[] {
                        Map.of("text", message)})});

        String response = webClient.post()
                .uri(gemini_api_url + gemini_api_key)
                .header("Content-Type", "application/json")
                .retrieve()
                .bodyToMono(String.class)
                .block();

    }
}
