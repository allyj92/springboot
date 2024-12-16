package com.codestates.member.service;

import com.codestates.exception.BusinessLogicException;
import com.codestates.exception.ExceptionCode;
import com.codestates.member.dto.MemberResponseDto;
import org.springframework.stereotype.Service;

import com.codestates.member.controller.entity.Member;

import java.util.ArrayList;
import java.util.List;

@Service
// 회원을 생성하는 메서드
public class MemberService {
    public Member createMember(Member member) {
        // do something...
        if (findByEmailExists(member)) throw new BusinessLogicException(ExceptionCode.EXIST_MEMBER_FOUND);
        return member;
    }
    // 회원 정보를 업데이트하는 메서드
    public Member updateMember(Member member) {
        // update member logic...
        return member;
    }

    // 회원 ID를 기반으로 회원 정보를 조회하는 메서드
    public Member getMember(long memberId) {
//        // Assuming a member is fetched from a database
//        Member member = new Member(memberId, "example@example.com", "John Doe", "123-456-7890");
//        return member;
          throw new RuntimeException("Not Found Member");
    }

    // 회원 ID를 기반으로 회원을 삭제하는 메서드
    public void deleteMember(long memberId) {
        // delete member logic...
    }

    // 모든 회원을 조회하여 리스트로 반환하는 메서드
    public List<Member> findMembers() {
        // logic to find and return a list of members
        return List.of(new Member(1L, "example@example.com", "John Doe", "123-456-7890"));
    }

    private boolean findByEmailExists(Member member){
        String email = member.getEmail();
//        String database = MemberRespository
        if(email.equals(member.getEmail())){
            return true;
        }
        return false;
    }
}