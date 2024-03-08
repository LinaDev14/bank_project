package org.example.bank.domain.repository;

import org.example.bank.domain.collections.Bank;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BankRepository extends MongoRepository<Bank, String> {
}
