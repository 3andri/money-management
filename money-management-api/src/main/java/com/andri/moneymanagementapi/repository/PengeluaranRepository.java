package com.andri.moneymanagementapi.repository;

import com.andri.moneymanagementapi.model.Pengeluaran;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PengeluaranRepository extends JpaRepository<Pengeluaran,Long> {
}
