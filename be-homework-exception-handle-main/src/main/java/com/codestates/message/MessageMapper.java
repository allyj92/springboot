package com.codestates.message;


import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageMapper {
    com.codestates.message.Message messageDtoToMessage(MessagePostDto messagePostDto);
    MessageResponseDto messageToMessageResponseDto(Message message);
}
