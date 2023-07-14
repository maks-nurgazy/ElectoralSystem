package com.maksnurgazy.electoralsystem.controllers;


import com.maksnurgazy.electoralsystem.dto.PartyDto;
import com.maksnurgazy.electoralsystem.entities.Party;
import com.maksnurgazy.electoralsystem.services.PartyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1/parties")
public class PartyController {
    private final PartyService partyService;

    @GetMapping
    public List<PartyDto> listParties(){
        return partyService.listParties();
    }
}
