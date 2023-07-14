package com.maksnurgazy.electoralsystem.services.impl;

import com.maksnurgazy.electoralsystem.dto.PartyDto;
import com.maksnurgazy.electoralsystem.mapper.PartyMapper;
import com.maksnurgazy.electoralsystem.repositories.PartyRepository;
import com.maksnurgazy.electoralsystem.services.PartyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PartyServiceImpl implements PartyService {
    private final PartyRepository partyRepository;
    private final PartyMapper partyMapper;

    @Override
    public List<PartyDto> listParties() {
        return partyRepository.findAllByOrderByNumberAsc().stream().map(partyMapper::fromEntity).toList();
    }
}
