package com.codestates.member.mapper;

import com.codestates.member.controller.entity.Member;
import com.codestates.member.dto.MemberPatchDto;
import com.codestates.member.dto.MemberPostDto;
import com.codestates.member.dto.MemberResponseDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class SpringMemberMapper {
    public Member memberPostDtoToMember(MemberPostDto memberPostDto){
        Member member = new Member(1L,
                memberPostDto.getEmail(),
                memberPostDto.getName(),
                memberPostDto.getPhone());
        return member;
    }
    public MemberResponseDto memberToResponseDto(Member member){
        MemberResponseDto response = new MemberResponseDto(
                member.getMemberId(),
                member.getEmail(),
                member.getName(),
                member.getPhone()
        );
        return response;
    }

    public Member memberPatchDtoToMember(MemberPatchDto memberPatchDto){
        Member member = new Member(1L,
                "temp@google.com",
                memberPatchDto.getName(),
                memberPatchDto.getPhone());
        return member;
    }

    public List<MemberResponseDto> membersToMemberResponseDtos(List<Member> members){
        List<MemberResponseDto> memberResponseDtos = new ArrayList<>();

        for (Member member : members) {
            MemberResponseDto memberResponseDto = this.memberToResponseDto(member);
            memberResponseDtos.add(memberResponseDto);
        }


        return memberResponseDtos;
    }

}
