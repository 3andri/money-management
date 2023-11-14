package com.andri.moneymanagementapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NoRekening {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRekening;
    private int noRekening;
    private String namaRekening;
    private  String kodeBank;
    private String namaBank;
    private int saldo;
    @CreatedDate
    @Column(name = "update_date",  updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime updateDate;
    @OneToMany()
    private List<Transaction> transactions;

    @ManyToOne
    @JoinColumn(name = "transaction_id_transaction")
    private Transaction transaction;


    @PrePersist
    public void prePersist() {
        updateDate =LocalDateTime.now();
    }
}
