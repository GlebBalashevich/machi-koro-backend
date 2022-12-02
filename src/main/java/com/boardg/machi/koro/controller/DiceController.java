package com.boardg.machi.koro.controller;

import com.boardg.machi.koro.dto.DiceRequestDto;
import com.boardg.machi.koro.dto.DiceResponseDto;
import com.boardg.machi.koro.service.DiceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
@RequiredArgsConstructor
public class DiceController {

    private final DiceService diceService;

    @MessageMapping("/dice/throw")
    @SendTo("/topic/dice")
    public DiceResponseDto throwDice(@Payload DiceRequestDto diceRequestDto) {
        log.info("Message received");
        return diceService.throwTheDice(diceRequestDto);
    }

}
