package com.chris.pmagtaservices.repository;

import com.chris.pmagtaservices.model.UserInventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInventoryRepository extends JpaRepository<UserInventory, Integer> {
}
