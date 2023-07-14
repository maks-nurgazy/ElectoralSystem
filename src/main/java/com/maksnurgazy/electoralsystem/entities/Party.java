package com.maksnurgazy.electoralsystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
public class Party {
    @Id
    private Long id;
    private String image;
    private Integer number;
    private String titleRu;
    private String titleKg;
}
