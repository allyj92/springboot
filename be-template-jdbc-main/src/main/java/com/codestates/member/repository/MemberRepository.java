package com.codestates.member.repository;

import com.codestates.member.entity.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MemberRepository extends CrudRepository<Member,Long> {

    // findBy 뒤에있는거를 기반으로 자동으로 쿼리문을 날려준다
    Optional<Member> findByEmail(String Email);
    Optional<Member> findByName(String name);

//    Optional<Member> findByMemberId(String memberId);
}
