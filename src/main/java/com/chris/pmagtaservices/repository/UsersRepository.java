package com.chris.pmagtaservices.repository;

import com.chris.pmagtaservices.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Integer> {

}
