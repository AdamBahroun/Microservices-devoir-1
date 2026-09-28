package com.adam.marque.service;

import com.adam.marque.dto.APIResponseDto;
import com.adam.marque.dto.MarqueDto;
import com.adam.marque.dto.VoitureDto;
import com.adam.marque.entities.Marque;
import com.adam.marque.repos.MarqueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MarqueServiceImpl implements MarqueService {

    private MarqueRepository marqueRepository;
    private APIClient apiClient;

    @Override
    public APIResponseDto getMarqueById(Long id) {
        Marque marque = marqueRepository.findById(id).get();

        VoitureDto voitureDto = apiClient.getVoitByCode(marque.getVoitCode());

        MarqueDto marqueDto = new MarqueDto(
                marque.getId(),
                marque.getNom(),
                marque.getPays(),
                marque.getVoitCode(),
                voitureDto.getVoitName()
        );

        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setMarqueDto(marqueDto);
        apiResponseDto.setVoitureDto(voitureDto);

        return apiResponseDto;
    }
}