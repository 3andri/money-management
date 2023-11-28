package com.andri.moneymanagementapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private String noRekening;
    private String namaRekening;
    private String kodeBank;
    private String namaBank;
    private int saldo;
    @Column(name = "update_date", updatable = true)
    private LocalDateTime updateDate;
    @Column(updatable = false)
    private LocalDateTime createDate;
    @JsonIgnore
    @OneToMany(mappedBy = "noRekening", fetch = FetchType.LAZY)
    //@JoinColumn(name = "idNorekening")
    private List<Transaction> transactions;

    @PrePersist
    public void prePersist() {
        updateDate = LocalDateTime.now();
        createDate = LocalDateTime.now();
    }
}
