package com.example.codestsates.member;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.PostMapping;

@Getter
@Setter
public class MemberPostDto {
    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String name;
    @Pattern(regexp = "^010-\\d{4}-\\d{4}$", message = "휴대폰 번호는 010-로 시작하는 13자리 숫자여야 합니다.")
    private String phone;

}