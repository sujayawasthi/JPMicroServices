package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

	Account findByUsername(String u);
}