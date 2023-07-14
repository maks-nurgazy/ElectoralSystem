package com.maksnurgazy.electoralsystem.repositories;

import com.maksnurgazy.electoralsystem.entities.Election;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectionRepository extends PagingAndSortingRepository<Election, Long> {
}
