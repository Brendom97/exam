package com.gloire.exam.repository;


import com.gloire.exam.domain.SearchHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchHistoryRepository extends JpaRepository<SearchHistory, Long> {

}

