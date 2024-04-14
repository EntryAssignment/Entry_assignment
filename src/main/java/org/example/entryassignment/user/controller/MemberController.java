package org.example.entryassignment.user.controller;

import lombok.RequiredArgsConstructor;
import org.example.entryassignment.user.dto.request.UserRequest;
import org.example.entryassignment.user.entity.Member;
import org.example.entryassignment.user.service.DeleteIdService;
import org.example.entryassignment.user.service.SignupService;
import org.example.entryassignment.user.service.ViewService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {
    private final SignupService signupService;
    private final DeleteIdService deleteIdService;
    private final ViewService viewService;

    @PostMapping("/signup")
    public void signup(@RequestBody UserRequest userRequest) {
        signupService.signup(userRequest);
    }

    @GetMapping("/{id}")
    public UserRequest memberView(@PathVariable("id") ) {

    }

    @DeleteMapping("/{id}")
    public void DeleteId (@PathVariable("id") Member request) {
        Member member = new Member(request);
        deleteIdService.DeleteId(member);

    }

}