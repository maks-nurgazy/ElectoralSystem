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
public class MemberDto {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String surname;
    private String imageUrl;
    private Integer number;
}
