package com.adam.marque.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDto {
    private MarqueDto marqueDto;
    private VoitureDto voitureDto;
}