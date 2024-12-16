package com.example.codestsates.member;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("v1/members")
public class MemberController {
    @PostMapping
    public ResponseEntity postMember(@RequestBody @Valid MemberPostDto memberPostDto){
//        String email = memberPostDto.getEmail();
//        System.out.println(email);
//        int count = 0;
//        for(char c : email.toCharArray()){
//            if(c=='@') count++;
//        }
//
//        String name = memberPostDto.getName();
//
//        if(count!=1 || email.indexOf('@')==0 || name.contains(" ")){
//            return  new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
//        }
        return new ResponseEntity<>(memberPostDto, HttpStatus.CREATED);
}

@GetMapping("/{member-id}")
public String getMember(@PathVariable("member-id")long memberId) {
    System.out.println("# memberId: " + memberId);

    // not implementation
    return String.valueOf(new ResponseEntity<>(HttpStatus.OK));
}

@GetMapping
public String getMembers() {
    System.out.println("# get Members");

    // not implementation
    return String.valueOf(new ResponseEntity<>(HttpStatus.OK));
}

}
