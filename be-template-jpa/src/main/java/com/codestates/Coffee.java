package com.codestates;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.tomcat.jni.Local;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coffee {

    @Id
    @GeneratedValue
    private long coffeeId;

    @Column(nullable = false, length = 50)
    private String korName;

    @Column(nullable = false, length = 50)
    private String engName;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false, length = 3)
    private String coffeeCode;

    @Column(nullable = false)
    private LocalDateTime createAt = LocalDateTime.now();

    @Column(nullable = false, name = "LAST_MODIFIED_AT")
    private LocalDateTime modifiedAt = LocalDateTime.now();
}
