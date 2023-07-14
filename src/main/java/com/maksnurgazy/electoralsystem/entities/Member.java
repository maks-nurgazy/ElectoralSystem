package com.maksnurgazy.electoralsystem.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
public class Member {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String surname;
    private String imageUrl;
    private Integer number;

    @ManyToOne
    @JoinColumn(name="party_id", nullable=false)
    private Party party;
}
