package com.andri.moneymanagementapi.controller;

import com.andri.moneymanagementapi.DTO.ResponseDTO;
import com.andri.moneymanagementapi.model.Pengeluaran;
import com.andri.moneymanagementapi.repository.PengeluaranRepository;
import com.andri.moneymanagementapi.service.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/pengeluaran")
public class PengeluaranController {
    @Autowired
    private PengeluaranRepository pengeluaranRepo;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ResponseEntity<ResponseDTO> addPengeluaran(@RequestBody Pengeluaran pengeluaran) {
        pengeluaranRepo.saveAndFlush(pengeluaran);
        return CommonResponse.getInstance().getOk();

    }
}
