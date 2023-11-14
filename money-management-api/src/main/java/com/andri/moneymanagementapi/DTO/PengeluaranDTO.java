package com.andri.moneymanagementapi.DTO;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Data
@Builder
public class PengeluaranDTO {
    private  long id;
    private long nomimal;
    private String keperluan;
    private String keterangan;
    private LocalDateTime createdAt;
}
