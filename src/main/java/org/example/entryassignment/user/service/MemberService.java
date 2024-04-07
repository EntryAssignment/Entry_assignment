package org.example.entryassignment.user.service;

import org.example.entryassignment.user.domain.Member;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    /**
     회원가입
     **/
    public Long join(Member member) {

        return member.getId();

    }

    /**
     회원조회
     **/


    /**
     회원수정
     **/


    /**
     회원삭제
     **/


}
