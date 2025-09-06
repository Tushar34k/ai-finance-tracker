package com.finance.tracker.model;

import jakarta.persistence.*;

@Entity
@Table(name = "reports")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String period; // e.g., JANUARY-2025
    private Double totalIncome;
    private Double totalExpense;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}

