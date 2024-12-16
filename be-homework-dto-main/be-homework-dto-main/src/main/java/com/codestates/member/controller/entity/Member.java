package com.codestates.member.controller.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor // 모든 필드를 포함한 생성자를 자동으로 생성하는 Lombok 애너테이션
@NoArgsConstructor // 기본 생성자를 자동으로 생성하는 Lombok 애너테이션
@Getter // 각 필드에 대한 getter 메서드를 자동으로 생성하는 Lombok 애너테이션
@Setter // 각 필드에 대한 setter 메서드를 자동으로 생성하는 Lombok 애너테이션
public class Member {
    private long memberId; // 회원 ID를 나타내는 필드
    private String email;  // 회원의 이메일을 나타내는 필드
    private String name;  // 회원의 이름을 나타내는 필드
    private String phone; // 회원의 전화번호를 나타내는 필드
}
