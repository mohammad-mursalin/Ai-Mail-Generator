package com.mursalin.spring_ai_demo.controller;

import com.mursalin.spring_ai_demo.service.ChatService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/ai-chat")
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    public String chatReply(@RequestBody String message) {
        return chatService.generateReply(message);
    }
}
