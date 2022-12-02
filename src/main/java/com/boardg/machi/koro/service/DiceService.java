package com.boardg.machi.koro.service;

import java.util.Random;

import com.boardg.machi.koro.dto.DiceRequestDto;
import com.boardg.machi.koro.dto.DiceResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DiceService {

    private Random random = new Random();

    public DiceResponseDto throwTheDice(DiceRequestDto diceRequestDto){
        Integer firstResult = random.nextInt(6) + 1;
        Integer secondResult = Boolean.TRUE.equals(diceRequestDto.getIsThrowsBoth()) ? random.nextInt(6) + 1 : -1;
        return DiceResponseDto.builder()
                .playerId(diceRequestDto.getPlayerId())
                .firstDiceResult(firstResult)
                .secondDiceResult(secondResult)
                .build();
    }

}
