package com.adam.marque.restControllers;

import com.adam.marque.dto.APIResponseDto;
import com.adam.marque.dto.MarqueDto;
import com.adam.marque.service.MarqueService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/marques")
@AllArgsConstructor
public class MarqueController {

    private MarqueService marquesService;

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getMarqueById(@PathVariable("id") Long id) {
        return new ResponseEntity<APIResponseDto>(marquesService.getMarqueById(id), HttpStatus.OK);
    }
}