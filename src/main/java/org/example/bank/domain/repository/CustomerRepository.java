package org.example.bank.domain.repository;

import org.example.bank.domain.collections.Customer;
import org.example.bank.domain.valueObjects.TypeIdentification;
import org.example.bank.domain.valueObjects.TypePerson;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

    List<Customer> findCustomerByFirstNameContainingIgnoreCaseOrderByFirstName(String firstName);
    List<Customer> findCustomerByLastNameContainingIgnoreCaseOrderByFirstName(String lastName);
    Optional<Customer>  findCustomerByPhone(String phone);
    Optional<Customer>findCustomerByIdAccount(String idAccount);


}
