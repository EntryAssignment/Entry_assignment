package org.example.entryassignment.user.service;

import lombok.RequiredArgsConstructor;
import org.example.entryassignment.user.dto.response.UserResponse;
import org.example.entryassignment.user.entity.Member;
import org.example.entryassignment.user.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor //final 키워드가 붙은 생성자를 통해 생성자 주입을 돕는다
public class ViewService {
    private MemberRepository memberRepository;

    public UserResponse memberView(long id) {
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("유저는 NULL일 수 없습니다."));
        return new UserResponse();
    }

}
//MVC, DTO,컨트롤러/서비스/레포지토리