package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class item {
    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long itemId;

    private String name;
    private int price;
    private int stockQuantity;

}
