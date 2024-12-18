package com.codestates;

import lombok.*;
import org.apache.tomcat.jni.Local;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Member {

    @Id
    @GeneratedValue
    private Long memberId;

    @Column(nullable = false, updatable = false, unique = true)
    private String email; 

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length=13, nullable = false, unique = true)
    private String phone;

    @Column(nullable = false)
    private LocalDateTime createAt = LocalDateTime.now();

    @Column(nullable = false, name = "LAST_MODIFIED_AT")
    private LocalDateTime modifiedAt = LocalDateTime.now();

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

    @Transient
    private String age;

    public Member(String email){
        this.email = email;
    }

    public Member(String email, String name, String phone) {
        this.email = email;
        this.name = name;
        this.phone = phone;
    }
}
