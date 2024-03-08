package org.example.bank.application.service.Customer;

import org.example.bank.domain.dto.CustomerDto;
import org.example.bank.domain.valueObjects.TypeIdentification;
import org.example.bank.domain.valueObjects.TypePerson;


import java.util.List;
import java.util.Optional;

public interface CustomerInterface {

    // Save all data
    List<CustomerDto> fillData(List<CustomerDto> customerDto);

    // list customer
    List<CustomerDto> listCustomer();

    // find by id
    Optional<CustomerDto> findByIdCustomer(String id);

    // save customer
    CustomerDto saveCustomer(CustomerDto customerDto);

    // update customer
    CustomerDto updateCustomer(CustomerDto customerDto);

    // delete customer
    void deleteCustomer(String id);

    // delete all customers
    void deleteAllCustomer();

    // find by username
    List<CustomerDto> findByCustomerFirstName(String firstName);
    List<CustomerDto> findByCustomerLastName(String lastName);

    // find by phone number
    CustomerDto findByPhone(String phone);

    // find by email
    CustomerDto findByEmail(String email);

    // find by age
    List<CustomerDto> findByAge(String age);

    // find by Type Identification
    List<CustomerDto> findByTypeIdentification(TypeIdentification typeIdentification);

    // find by number identification
    CustomerDto findByNumberIdentification(String numberIdentification);

    // find by type person
    List<CustomerDto> findByTypePerson(TypePerson typePerson);

    // find customer by IdAccount
    CustomerDto findByIdAccount(String idAccount);





}
