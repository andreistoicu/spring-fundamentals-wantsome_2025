package com.wantsome.layered.databases.dao_repository_domain;

import com.wantsome.layered.databases.dao_repository_domain.entity.BankAccount;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BankAccountRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(BankAccount bankAccount) {
        if(bankAccount.getId() == null) {
            em.persist(bankAccount);
        } else {
            em.merge(bankAccount);
        }
    }

    public List<BankAccount> findAll() {
        return em.createQuery(
                "select b from BankAccount b", BankAccount.class)
                .getResultList();
    }
}
