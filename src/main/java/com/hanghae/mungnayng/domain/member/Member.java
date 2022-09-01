package com.hanghae.mungnayng.domain.member;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String password;

//    @Column(unique = true)
//    private Long kakaoId;
    private String role;

    public Member(String email, String nickname, String password) {
        this.email = email;
        this.nickname = nickname;
        this.password = password;
//        this.kakaoId = null;
        role = "USER";
    }

    public static Member of(String email, String nickname, String password) {
        return new Member(email, nickname, password);
    }
}
