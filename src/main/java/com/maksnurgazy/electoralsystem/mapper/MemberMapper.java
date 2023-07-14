package com.maksnurgazy.electoralsystem.mapper;

import com.maksnurgazy.electoralsystem.dto.MemberDto;
import com.maksnurgazy.electoralsystem.entities.Member;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface MemberMapper {
    MemberDto fromEntity(Member member);
}