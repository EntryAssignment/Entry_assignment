package org.example.entryassignment.user.controller;

import org.example.entryassignment.user.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MemberController {
    @RestController
    @RequestMapping("/members")
    public MemberController {
        @Autowired
        MemberService memberService;

    }




}