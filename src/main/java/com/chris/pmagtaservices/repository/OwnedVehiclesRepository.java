package com.chris.pmagtaservices.repository;

import com.chris.pmagtaservices.model.OwnedVehicles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnedVehiclesRepository extends JpaRepository<OwnedVehicles, Integer> {
}
