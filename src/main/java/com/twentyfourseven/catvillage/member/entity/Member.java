package com.twentyfourseven.catvillage.member.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Member {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false, length = 254)
    private String email;

    @Column(nullable = false, length = 80)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MemberRole role;

    public String getRole() {
        return role.toString();
    }
}
