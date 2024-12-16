package com.codestates;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name="ORDERS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order { 

    @Id
    @GeneratedValue
    private long orderId;

    @Enumerated(EnumType.STRING) // String 권장
    private OrderStatus orderStatus = OrderStatus.ORDER_REQUEST;

    @Column(nullable = false)
    private LocalDateTime createAt = LocalDateTime.now();

    @Column(nullable = false,name="LAST_MODIFIED_AT")
    private LocalDateTime modifiedAt = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    public void addMember(Member member){
        this.member = member;
    }


}
