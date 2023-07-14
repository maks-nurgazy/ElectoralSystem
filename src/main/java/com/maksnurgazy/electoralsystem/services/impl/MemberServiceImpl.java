package com.maksnurgazy.electoralsystem.services.impl;

import com.maksnurgazy.electoralsystem.dto.MemberDto;
import com.maksnurgazy.electoralsystem.mapper.MemberMapper;
import com.maksnurgazy.electoralsystem.repositories.MemberRepository;
import com.maksnurgazy.electoralsystem.services.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;
    private final MemberMapper memberMapper;

    @Override
    public List<MemberDto> listMembers() {
        return memberRepository.findAllByOrderByNumberAsc().stream().map(memberMapper::fromEntity).toList();
    }

    @Override
    public List<MemberDto> listPartyMembers(Long id) {
        return memberRepository.findAllByPartyIdOrderByNumberAsc(id).stream().map(memberMapper::fromEntity).toList();
    }
}
