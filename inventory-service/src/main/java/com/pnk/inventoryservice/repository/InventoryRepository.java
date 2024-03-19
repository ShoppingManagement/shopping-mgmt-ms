package com.pnk.inventoryservice.repository;

import com.pnk.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    Optional<List<Inventory>> findBySkuCode(String skuCode);
}
