package com.maksnurgazy.electoralsystem.controllers;


import com.maksnurgazy.electoralsystem.dto.MemberDto;
import com.maksnurgazy.electoralsystem.services.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1/members")
public class MemberController {
    private final MemberService memberService;

    @GetMapping
    public List<MemberDto> listMembers(){
        return memberService.listMembers();
    }

    @GetMapping("/party/{id}")
    public List<MemberDto> listPartyMembers(@PathVariable Long id){
        return memberService.listPartyMembers(id);
    }
}
