package com.maksnurgazy.electoralsystem.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
public class PartyDto {
    @Id
    private Long id;
    private String image;
    private Integer number;
    private String titleRu;
    private String titleKg;
}
