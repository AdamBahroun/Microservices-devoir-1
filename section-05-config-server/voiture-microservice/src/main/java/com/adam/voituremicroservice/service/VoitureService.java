package com.adam.voituremicroservice.service;

import com.adam.voituremicroservice.dto.VoitureDto;

public interface VoitureService {
    VoitureDto getVoitureByCode(String code);
}