package com.finance.tracker.model;

import com.finance.tracker.enums.CategoryType;
import jakarta.persistence.*;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Table(name = "categories", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"user_id", "name", "type"})
})
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Category {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional=false) @JoinColumn(name="user_id")
    private User user;

    @Column(nullable=false) private String name; // Food, Rent, Salary
    @Enumerated(EnumType.STRING) @Column(nullable=false)
    private CategoryType type;

    @OneToMany(mappedBy = "category")
    private Set<Transaction> transactions;
}
