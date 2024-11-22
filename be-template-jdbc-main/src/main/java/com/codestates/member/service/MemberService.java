package com.codestates.member.service;

import com.codestates.exception.BusinessLogicException;
import com.codestates.exception.ExceptionCode;
import com.codestates.member.entity.Member;
import com.codestates.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * V2
 *  - 메서드 구현
 *  - DI 적용
 */




@Service
public class MemberService {

    private MemberRepository memberRepository;


    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member createMember(Member member) {
        // 자동으로 등록해줌
        verifyExistEmail(member.getEmail());

        Member saveMember = memberRepository.save(member);
        return saveMember;
    }

    public Member updateMember(Member member) {
        // 현재 존재하는 멤버
       Member findMember = findVerifiedMember(member.getMemberId());

       Optional.ofNullable(member.getName())
               .ifPresent(name -> findMember.setName(name));
       Optional.ofNullable(member.getPhone())
               .ifPresent(phone -> findMember.setPhone(phone));
       return memberRepository.save(findMember);

    }

    public Member findMember(long memberId) {

        return findVerifiedMember(memberId);
    }

    public List<Member> findMembers() {
        // 모든 회원 정보 조회
        return (List<Member>) memberRepository.findAll();
    }

    public void deleteMember(long memberId) {
        Member findMember = findVerifiedMember(memberId);
        memberRepository.delete(findMember);
    }
    // 이미 존재하는 회원인지를 검증
    public Member findVerifiedMember(long memberId){
        Optional<Member> optionalMember =
                memberRepository.findById(memberId);
        Member findMember =
                optionalMember.orElseThrow(()->
                    new BusinessLogicException(ExceptionCode.MEMBER_NOT_FOUND));
        return findMember;
    }


    // 이미 등록된 이메일 주소인지 검증
    private void verifyExistEmail(String email){
        Optional<Member> member = memberRepository.findByEmail(email);
        if(member.isPresent()){
            throw new BusinessLogicException(ExceptionCode.MEMBER_EXISTS);
        }


    }
}
