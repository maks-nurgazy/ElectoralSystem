package com.maksnurgazy.electoralsystem.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
public class ElectionDto {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name="member_id", nullable=false)
    private MemberDto member;

    @ManyToOne
    @JoinColumn(name="party_id", nullable=false)
    private PartyDto party;
}
