package com.andri.moneymanagementapi.repository;

import com.andri.moneymanagementapi.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}