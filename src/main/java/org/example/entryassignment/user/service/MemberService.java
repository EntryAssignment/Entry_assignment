package org.example.entryassignment.user.service;

import org.example.entryassignment.user.entity.Member;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    /**
    회원가입
     **/
    public Long join(Member member) {
        validateDuplicateMember(member);
        return member.getUserId();
        return member.getNickname();
        return member.getUserPw();
        return member.getUserEmail();
    }
    
    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getUserId())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 아이디입니다.");
                });
    }


    /**
     회원수정
     **/


    /**
     회원삭제
     **/


}
