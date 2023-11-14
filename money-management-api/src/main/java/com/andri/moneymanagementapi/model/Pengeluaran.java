package com.andri.moneymanagementapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pengeluaran {

    @Id
    @GeneratedValue
    private  long id;
    private long nomimal;
    private String keperluan;
    private String keterangan;
    @CreatedDate
    @Column(name = "created_at",  updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdAt;
}
