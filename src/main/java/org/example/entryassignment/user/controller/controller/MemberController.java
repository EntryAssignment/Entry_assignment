package org.example.entryassignment.user.controller.controller;

import lombok.RequiredArgsConstructor;
import org.example.entryassignment.user.dto.request.UserRequest;
import org.example.entryassignment.user.dto.response.UserResponse;
import org.example.entryassignment.user.entity.Member;
import org.example.entryassignment.user.service.DeleteIdService;
import org.example.entryassignment.user.service.SignupService;
import org.example.entryassignment.user.service.ViewService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
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
    public UserResponse memberView(@PathVariable("id") long id) {
        return viewService.memberView(id);
    }

    @DeleteMapping("/{id}")
    public void DeleteId(@PathVariable("id") UserRequest request) {
        Member member = new Member(request);
        deleteIdService.DeleteId(member);
    }

}