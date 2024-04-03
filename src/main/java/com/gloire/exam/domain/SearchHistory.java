package com.gloire.exam.domain;



import jakarta.persistence.*;
import jakarta.persistence.Table;


import java.time.LocalDate;

@Entity
@Table(name = "search_history")
public class SearchHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "searched_date")
    private LocalDate searchedDate;


}

