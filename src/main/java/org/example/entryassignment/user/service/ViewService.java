package org.example.entryassignment.user.service;

import lombok.RequiredArgsConstructor;
import org.example.entryassignment.user.dto.request.UserRequest;
import org.example.entryassignment.user.dto.response.UserResponse;
import org.example.entryassignment.user.entity.Member;
import org.example.entryassignment.user.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ViewService {
    private MemberRepository memberRepository;
    private UserResponse response;

    public long memberView(long id){
        Optional<Member> memberOptional = memberRepository.findById(id);
        if (memberOptional.isPresent()){
            return response.toMemberDTO(memberOptional.get()); // optional을 벗겨내서 entity -> dto 변환
        }else {
            return null;
        }


    }

}
