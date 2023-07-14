package com.maksnurgazy.electoralsystem.repositories;

import com.maksnurgazy.electoralsystem.entities.Member;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {
    List<Member> findAllByOrderByNumberAsc();
    List<Member> findAllByPartyIdOrderByNumberAsc(Long id);
}
