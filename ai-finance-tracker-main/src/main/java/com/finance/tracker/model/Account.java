package com.finance.tracker.model;

import com.finance.tracker.enums.AccountType;
import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Table(name = "accounts")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Account {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional=false) @JoinColumn(name="user_id")
    private User user;

    @Column(nullable=false) private String name;      // e.g., HDFC Savings
    @Enumerated(EnumType.STRING) @Column(nullable=false)
    private AccountType type;

    @Column(nullable=false) private String currency;  // INR, USD
    @Column(nullable=false) private Double balance;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Transaction> transactions;
}
