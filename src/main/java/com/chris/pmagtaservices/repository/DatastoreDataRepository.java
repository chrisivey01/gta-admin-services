package com.chris.pmagtaservices.repository;

import com.chris.pmagtaservices.model.DatastoreData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatastoreDataRepository extends JpaRepository <DatastoreData, Integer> {
}
