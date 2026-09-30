package com.adam.voituremicroservice.service;

import com.adam.voituremicroservice.dto.VoitureDto;
import com.adam.voituremicroservice.entities.Voiture;
import com.adam.voituremicroservice.repos.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoitureServiceImpl implements VoitureService {
    @Autowired
    VoitureRepository voitureRepository;

    @Override
    public VoitureDto getVoitureByCode(String code) {
        Voiture v = voitureRepository.findByVoitCode(code);
        VoitureDto voitureDto = new VoitureDto(
                v.getId(),
                v.getVoitName(),
                v.getVoitCode()
        );
        return voitureDto;
    }
}