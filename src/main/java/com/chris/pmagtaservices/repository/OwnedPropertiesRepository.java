package com.chris.pmagtaservices.repository;

import com.chris.pmagtaservices.model.OwnedProperties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnedPropertiesRepository extends JpaRepository<OwnedProperties, Integer> {
}
