package com.boardg.machi.koro.dto;

import lombok.Data;

@Data
public class DiceRequestDto {

    private String playerId;

    private Boolean isThrowsBoth;

}
