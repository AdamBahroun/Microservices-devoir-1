package com.adam.voituremicroservice.restControllers;

import com.adam.voituremicroservice.dto.VoitureDto;
import com.adam.voituremicroservice.service.VoitureService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/voitures")
@AllArgsConstructor
public class VoitureController {
    private VoitureService voitureService;

    @GetMapping("{code}")
    public ResponseEntity<VoitureDto> getVoitByCode(@PathVariable("code") String code) {
        return new ResponseEntity<VoitureDto>(
                voitureService.getVoitureByCode(code), HttpStatus.OK);
    }
}