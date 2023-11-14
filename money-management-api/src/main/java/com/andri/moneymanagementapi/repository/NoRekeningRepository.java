package com.andri.moneymanagementapi.repository;

import com.andri.moneymanagementapi.model.NoRekening;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoRekeningRepository extends JpaRepository<NoRekening, Integer> {
}