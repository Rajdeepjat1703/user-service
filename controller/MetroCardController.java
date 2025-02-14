package com.webknot.user_service.controller;

import com.webknot.user_service.model.MetroCard;
import com.webknot.user_service.service.MetroCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metro-card")
@RequiredArgsConstructor
public class MetroCardController {

    @Autowired
    private MetroCardService metroCardService;

    @PostMapping
    public ResponseEntity<MetroCard> buyMetroCard(@RequestBody MetroCard metroCard) {
        return ResponseEntity.ok(metroCardService.buyMetroCard(metroCard));
    }

    @DeleteMapping("/{cardNumber}")
    public ResponseEntity<String> deleteMetroCard(@PathVariable String cardNumber) {
        return ResponseEntity.ok(metroCardService.deleteMetroCard(cardNumber));
    }
}

