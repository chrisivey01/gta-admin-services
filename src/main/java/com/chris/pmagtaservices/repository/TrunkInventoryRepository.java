package com.chris.pmagtaservices.repository;

import com.chris.pmagtaservices.model.TrunkInventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrunkInventoryRepository extends JpaRepository<TrunkInventory, Integer> {
}
