package com.web.sundragon7.repository;

import com.web.sundragon7.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
