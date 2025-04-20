package com.scheduler.shedlock.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "shedlock")
public class ShedLock {
    @Id
    @Column(name = "name", length = 64)
    private String name;

    @Column(nullable = false)
    private LocalDateTime lockUntil;

    @Column(nullable = false)
    private LocalDateTime lockedAt;

    @Column(nullable = false)
    private String lockedBy;
}
