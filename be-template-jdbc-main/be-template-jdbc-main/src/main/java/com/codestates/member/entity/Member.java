package com.codestates.member.entity;

import com.codestates.order.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *  - 멤버 변수 추가
 *  - lombok 추가
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    private long memberId;

    private String email;

    private String name;

    private String phone;

    @MappedCollection(idColumn = "MEMBER_ID")
    private Set<Order> orders = new LinkedHashSet<>();


}
