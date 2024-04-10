package org.example.entryassignment.user.service;

import lombok.RequiredArgsConstructor;
import org.example.entryassignment.user.dto.request.UserRequest;
import org.example.entryassignment.user.entity.Member;
import org.example.entryassignment.user.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignupService {
    private final MemberRepository memberRepository;

    public void signup(UserRequest request) {
        Member member = new Member();

    }

}
