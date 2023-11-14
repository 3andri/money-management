package com.andri.moneymanagementapi.controller;

import com.andri.moneymanagementapi.DTO.ResponseDTO;
import com.andri.moneymanagementapi.model.NoRekening;
import com.andri.moneymanagementapi.model.Pengeluaran;
import com.andri.moneymanagementapi.repository.NoRekeningRepository;
import com.andri.moneymanagementapi.service.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/no-rekening")
public class NoRekeningController {
    @Autowired
    private NoRekeningRepository noRekeningRepository;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ResponseEntity<ResponseDTO> addNoRekening(@RequestBody NoRekening noRekening) {
        noRekeningRepository.saveAndFlush(noRekening);
        return CommonResponse.getInstance().getOk();

    }
}
