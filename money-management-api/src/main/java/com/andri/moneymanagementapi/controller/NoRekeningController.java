package com.andri.moneymanagementapi.controller;

import com.andri.moneymanagementapi.DTO.ResponseDTO;
import com.andri.moneymanagementapi.model.NoRekening;
import com.andri.moneymanagementapi.model.Pengeluaran;
import com.andri.moneymanagementapi.repository.NoRekeningRepository;
import com.andri.moneymanagementapi.service.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.Console;
import java.util.List;

@RestController
@RequestMapping(value = "/no-rekening")
@Slf4j
public class NoRekeningController {
    @Autowired
    private NoRekeningRepository noRekeningRepository;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ResponseEntity<ResponseDTO> addNoRekening(@RequestBody NoRekening noRekening) {
        noRekeningRepository.saveAndFlush(noRekening);
        log.info("test {}",noRekening.getNoRekening());
        return CommonResponse.getInstance().getOk();

    }
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResponseEntity<List<NoRekening>> listNoRekening() {
        return  ResponseEntity.ok(noRekeningRepository.findAll());
    }
}
