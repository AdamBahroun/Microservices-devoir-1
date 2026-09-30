package com.adam.marque.service;

import com.adam.marque.dto.VoitureDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "VOITURE")
public interface APIClient {

    @GetMapping("api/voitures/{voiture-code}")
    VoitureDto getVoitByCode(@PathVariable("voiture-code") String voitureCode);
}