package com.andri.moneymanagementapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Transaction implements Serializable {
    @Id
    private int idTransaction;
    private int idNorekening;
    private Boolean debitOrcredit;
    private int Nominal;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime tanggal;
    private int saldo;
    //@ManyToOne
    //@JoinColumn(name = "id_norekening")
    //private NoRekening noRekening;
}
