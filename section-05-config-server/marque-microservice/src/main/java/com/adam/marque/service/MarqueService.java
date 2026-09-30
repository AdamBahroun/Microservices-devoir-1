package com.adam.marque.service;

import com.adam.marque.dto.APIResponseDto;

public interface MarqueService {
    APIResponseDto getMarqueById(Long id);
}