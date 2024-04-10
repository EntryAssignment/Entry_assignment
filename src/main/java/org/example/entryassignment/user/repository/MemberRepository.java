package org.example.entryassignment.user.repository;

import org.example.entryassignment.user.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
