package com.chris.pmagtaservices.repository;

import com.chris.pmagtaservices.model.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepository extends JpaRepository<Billing, Integer> {
}
