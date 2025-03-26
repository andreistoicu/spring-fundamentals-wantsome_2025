package com.wantsome.layered.databases.dao_repository_domain;

import com.wantsome.layered.databases.dao_repository_domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerJpaRepository extends JpaRepository<Customer, Long> {
}
