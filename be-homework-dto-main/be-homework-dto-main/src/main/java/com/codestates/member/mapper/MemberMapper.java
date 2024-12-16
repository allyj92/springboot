package com.codestates.member.mapper;

import com.codestates.member.controller.entity.Member;
import com.codestates.member.dto.MemberPatchDto;
import com.codestates.member.dto.MemberPostDto;
import com.codestates.member.dto.MemberResponseDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
//  인터페이스가 MapStruct 매퍼임을 나타냄
@Mapper(componentModel = "spring") // 매퍼가 Spring 빈으로 생성
public interface MemberMapper {
    // MemberPostDto Member 엔티티로 변환하는 메서드
    // Member <== MemberPostDto
    Member memberPostToMember(MemberPostDto memberPostDto);
    // Member 엔티티를 MemberResponseDto로 변환하는 메서드
    // MemberResponseDto <== Member
    MemberResponseDto memberToMemberResponseDto(Member member);
    // MemberPatchDto를 Member 엔티티로 변환하는 메서드
    // Member <== MemberPatchDto
    Member memberPatchDtoToMember(MemberPatchDto memberPatchDto);
    // Member 엔티티 리스트를 MemberResponseDto 리스트로 변환하는 메서드
    // MemberResponseDto 리스트 <== members
    List<MemberResponseDto> membersToMemberResponseDtos(List<Member> members);

}
