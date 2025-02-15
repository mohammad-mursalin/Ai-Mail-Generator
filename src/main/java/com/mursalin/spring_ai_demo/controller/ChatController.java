package com.mursalin.spring_ai_demo.controller;

import com.mursalin.spring_ai_demo.service.ChatService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/ai-chat")
@AllArgsConstructor
public class ChatController {

    private final ChatService chatService;

//    public ChatController(ChatService chatService) {
//        this.chatService = chatService;
//    }

    @PostMapping
    public String chatReply(@RequestBody String message) {
        return chatService.generateReply(message);
    }
}
