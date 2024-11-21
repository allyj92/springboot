package com.codestates.message;

import com.codestates.message.Message;
import com.codestates.message.MessageMapper;
import com.codestates.message.MessagePostDto;
import com.codestates.message.MessageResponseDto;
import com.codestates.message.MessageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/messages")
public class MessageController {
    private final MessageService messageService;
    private final MessageMapper mapper;

    public MessageController(MessageService messageService, MessageMapper mapper) {
        this.messageService = messageService;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity<MessageResponseDto> postMessage(@RequestBody MessagePostDto messagePostDto) {
        Message message = messageService.createMessage(mapper.messageDtoToMessage(messagePostDto));
        return new ResponseEntity<>(mapper.messageToMessageResponseDto(message), HttpStatus.CREATED);
    }
}
