package com.andri.moneymanagementapi.controller;

import com.andri.moneymanagementapi.DTO.ResponseDTO;
import com.andri.moneymanagementapi.model.Pengeluaran;
import com.andri.moneymanagementapi.model.Transaction;
import com.andri.moneymanagementapi.repository.TransactionRepository;
import com.andri.moneymanagementapi.service.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/transaction")
@CrossOrigin(origins = "*")
public class TransactionController {
    @Autowired
    private TransactionRepository transactionRepository;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ResponseEntity<ResponseDTO> addTransaction(@RequestBody Transaction transaction) {
        transactionRepository.saveAndFlush(transaction);
        return CommonResponse.getInstance().getOk();

    }

    @RequestMapping(value = "all", method = RequestMethod.GET)
    @Transactional
    public ResponseEntity<List<Transaction>> allTransaction() {
        return ResponseEntity.ok(transactionRepository.findAll());

    }
}
