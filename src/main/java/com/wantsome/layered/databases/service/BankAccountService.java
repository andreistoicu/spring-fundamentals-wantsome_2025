package com.wantsome.layered.databases.service;

import com.wantsome.layered.databases.dao_repository_domain.BankAccountRepository;
import com.wantsome.layered.databases.dao_repository_domain.entity.BankAccount;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountService {

    private final BankAccountRepository bankAccountRepository;

    public BankAccountService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    @Transactional
    public void save(BankAccount bankAccount) {
        bankAccountRepository.save(bankAccount);
    }

    public List<BankAccount> findAll() {
        return bankAccountRepository.findAll();
    }
}
