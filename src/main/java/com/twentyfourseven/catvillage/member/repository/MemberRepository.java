package com.twentyfourseven.catvillage.member.repository;

import com.twentyfourseven.catvillage.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
