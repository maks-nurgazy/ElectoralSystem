package com.maksnurgazy.electoralsystem.services;

import com.maksnurgazy.electoralsystem.dto.MemberDto;

import java.util.List;

public interface MemberService {
    List<MemberDto> listMembers();

    List<MemberDto> listPartyMembers(Long id);
}
