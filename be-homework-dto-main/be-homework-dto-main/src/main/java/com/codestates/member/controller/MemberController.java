package com.codestates.member.controller;

import com.codestates.member.controller.entity.Member;
import com.codestates.member.dto.MemberPatchDto;
import com.codestates.member.dto.MemberPostDto;
import com.codestates.member.dto.MemberResponseDto;
import com.codestates.member.mapper.MemberMapper;
import com.codestates.member.service.MemberService;
import com.codestates.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.FieldError;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/members")
@Validated
public class MemberController {
    private final MemberService memberService;
    private final MemberMapper mapper;

    public MemberController(MemberService memberService, MemberMapper mapper) {
        this.memberService = memberService;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity<MemberResponseDto> postMember(@Valid @RequestBody MemberPostDto memberDto) {
        Member createMember = memberService.createMember(mapper.memberPostToMember(memberDto));
        return new ResponseEntity<>(mapper.memberToMemberResponseDto(createMember), HttpStatus.CREATED);
    }

    @PatchMapping("/{member-id}")
    public ResponseEntity<MemberResponseDto> patchMember(@PathVariable("member-id") @Min(1) long memberId,
                                                         @Valid @RequestBody MemberPatchDto memberPatchDto) {
        memberPatchDto.setMemberId(memberId);
        Member member = mapper.memberPatchDtoToMember(memberPatchDto);
        Member updatedMember = memberService.updateMember(member);
        MemberResponseDto responseDto = mapper.memberToMemberResponseDto(updatedMember);
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    @GetMapping("/{member-id}")
    public ResponseEntity<MemberResponseDto> getMember(@PathVariable("member-id") @Min(1) long memberId) {
        System.out.println("# memberId: " + memberId);
        Member member = memberService.getMember(memberId);
        return new ResponseEntity<>(mapper.memberToMemberResponseDto(member), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<MemberResponseDto>> getMembers() {
        System.out.println("# get Members");
        List<Member> members = memberService.findMembers();
        List<MemberResponseDto> memberResponseDtos = mapper.membersToMemberResponseDtos(members);
        return new ResponseEntity<>(memberResponseDtos, HttpStatus.OK);
    }

    @DeleteMapping("/{member-id}")
    public ResponseEntity<Void> deleteMember(@PathVariable("member-id") @Min(1) long memberId) {
        System.out.println("# memberId: " + memberId);
        memberService.deleteMember(memberId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }





}