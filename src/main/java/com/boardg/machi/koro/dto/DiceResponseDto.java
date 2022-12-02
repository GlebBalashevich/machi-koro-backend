package com.boardg.machi.koro.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DiceResponseDto {

    private String playerId;

    private Integer firstDiceResult;

    private Integer secondDiceResult;
}
