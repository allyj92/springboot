package com.codestates.coffee;

import com.codestates.member.NotSpace;
import lombok.Getter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
public class CoffeePatchDto {
    @NotSpace
    @NotBlank
    private String korName;
    @Range(min = 100, max = 50000)
    private int price;
}
