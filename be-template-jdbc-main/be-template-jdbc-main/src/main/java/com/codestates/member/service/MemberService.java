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
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member createMember(Member member) {
        verifyExistsEmail(member.getEmail());
        Member savedMember = memberRepository.save(member);
        return savedMember;
    }

    public Member updateMember(Member member) {
        Member findMember = findverifiedMember(member.getMemberId());

        findMember.setName(member.getName());

//        if(member.getName() != null) findMember.setName(member.getName());
//        if(member.getPhone()!= null) findMember.setPhone(member.getPhone());
        Optional.ofNullable(member.getName())
                .ifPresent(name -> findMember.setName(name));
        Optional.ofNullable(member.getPhone())
                .ifPresent(phone -> findMember.setName(phone));
        return memberRepository.save(findMember);
    }

    public Member findMember(long memberId) {
        return findverifiedMember(memberId);
    }

    public List<Member> findMembers() {
        return  (List<Member>) memberRepository.findAll();

    }

    public void deleteMember(long memberId) {
        Member findMember = findverifiedMember(memberId);
        memberRepository.delete(findMember);
    }

    private void verifyExistsEmail(String email) {
        Optional<Member> optionalMember = memberRepository.findByEmail(email);
        if (optionalMember.isPresent()) {
            throw new BusinessLogicException(ExceptionCode.MEMBER_EXISTS);
        }
    }

    private Member findverifiedMember(long memberId) {
        Optional<Member> optionalMember = memberRepository.findById(memberId);
        return optionalMember.orElseThrow(
                ()->new BusinessLogicException(ExceptionCode.MEMBER_NOT_FOUND));
    }
}