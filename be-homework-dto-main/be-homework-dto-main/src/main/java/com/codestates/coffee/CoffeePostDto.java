package com.codestates.coffee;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class CoffeePostDto {
    @NotBlank
    @Pattern(regexp="^([가-힣])(\\S?[가-힣])*$")
    private String korName;
    @NotBlank
    @Pattern(regexp="^([a-zA-Z])(\\S?[a-zA-Z])*$")
    private String engName;
    @Min(1)
    private String price;
}

