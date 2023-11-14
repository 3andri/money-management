package com.andri.moneymanagementapi.service;

import com.andri.moneymanagementapi.DTO.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
@Slf4j
public class CommonResponse {

    private static CommonResponse INSTANCE;
    private String info = "Initial info class";

    private CommonResponse() {
    }

    public static CommonResponse getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new CommonResponse();
        }

        return INSTANCE;
    }

    public ResponseEntity<ResponseDTO> getOk(){

        ResponseDTO responseDTO= ResponseDTO.builder().status(200).statusDescription("Success").build();
        return ResponseEntity.ok(responseDTO);

    }
}
