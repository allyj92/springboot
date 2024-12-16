package com.codestates.member.repository;

import com.codestates.member.entity.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MemberRepository extends CrudRepository<Member,Long> {
    // SELECT * FROM MEMBER WHERE email = {email} 자동으로 쿼리문 생성
    Optional<Member> findByEmail(String email);
    Optional<Member> findByName(String name);

}
