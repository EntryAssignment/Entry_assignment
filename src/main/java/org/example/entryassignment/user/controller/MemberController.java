package org.example.entryassignment.user.controller;

import lombok.RequiredArgsConstructor;
import org.example.entryassignment.user.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import orgspringframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

}