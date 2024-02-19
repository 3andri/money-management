package com.andri.moneymanagementapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE,region = "data")
public class Transaction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idTransaction;
    @Transient
    private String idNorekening;
    private Boolean debitOrCredit;
    private int Nominal;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime tanggal;
    private int saldo;
    @ManyToOne
    @JoinColumn(name = "idNorekening",nullable = false)
    @JsonIgnore
    private NoRekening noRekening;


    @PrePersist
    void set(){
        setNoRekening(NoRekening.builder().noRekening(idNorekening).build());
    }
    @PostLoad
    void setload(){
        setIdNorekening(noRekening.getNoRekening());
    }
}
