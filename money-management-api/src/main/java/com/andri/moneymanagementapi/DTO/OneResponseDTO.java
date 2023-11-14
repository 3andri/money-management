package com.andri.moneymanagementapi.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OneResponseDTO {
    private int status;
    private String statusDescription;
    private Object data;
}
