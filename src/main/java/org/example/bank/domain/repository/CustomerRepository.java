package org.example.bank.domain.repository;

import org.example.bank.domain.collections.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
