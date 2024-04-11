package org.example.entryassignment.user.service.Del;

import org.example.entryassignment.user.entity.Member;
import org.example.entryassignment.user.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    /**
    회원가입
     **/
    public String join(Member member) {
        validateDuplicateMember(member);
        return member.getUserId();
        return member.getUserPw();
        return member.getUserEmail();
    }
    
    private void validateDuplicateMember(Member member) {
        memberRepository.findById(member.getUserId())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 아이디입니다.");
                });
    }


    /**
     회원삭제
     **/
    public void deleteMember(String id) {
        memberRepository.deleteById(id);
    }


}
