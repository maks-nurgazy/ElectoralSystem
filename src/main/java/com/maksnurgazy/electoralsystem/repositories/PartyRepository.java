package com.maksnurgazy.electoralsystem.repositories;

import com.maksnurgazy.electoralsystem.entities.Party;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartyRepository extends PagingAndSortingRepository<Party, Long> {
    List<Party> findAllByOrderByNumberAsc();
}
