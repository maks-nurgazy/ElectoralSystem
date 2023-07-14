package com.maksnurgazy.electoralsystem.mapper;


import com.maksnurgazy.electoralsystem.dto.PartyDto;
import com.maksnurgazy.electoralsystem.entities.Party;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface PartyMapper {
    PartyDto fromEntity(Party party);
}
