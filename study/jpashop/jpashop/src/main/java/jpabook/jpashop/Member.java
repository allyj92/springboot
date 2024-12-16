package jpabook.jpashop;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity
@Getter
@Setter
public class Member {

    @Id @GenertatedValue
    private Long id;
    private String username;
}
