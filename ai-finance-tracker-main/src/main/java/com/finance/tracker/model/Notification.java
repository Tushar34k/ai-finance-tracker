package com.finance.tracker.model;

import com.finance.tracker.enums.AlertType;
import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;

@Entity
@Table(name = "notifications", indexes = {
        @Index(name="idx_notif_user_when", columnList = "user_id, createdAt")
})
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Notification {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional=false) @JoinColumn(name="user_id")
    private User user;

    @Enumerated(EnumType.STRING) @Column(nullable=false)
    private AlertType type; // INFO/WARNING/CRITICAL

    @Column(nullable=false, length=500)
    private String message;

    @Column(nullable=false)
    private Boolean readFlag;

    @Column(nullable=false)
    private Instant createdAt;
}