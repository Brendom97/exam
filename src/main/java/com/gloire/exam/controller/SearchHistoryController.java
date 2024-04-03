package com.gloire.exam.controller;

import com.gloire.exam.domain.SearchHistory;
import com.gloire.exam.repository.SearchHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/historique")
public class SearchHistoryController {

    @Autowired
    private SearchHistoryRepository searchHistoryRepository;

    @GetMapping("/all")
    public List<SearchHistory> getAllSearchHistory() {
        return searchHistoryRepository.findAll();
    }
}

