package org.example.bank.application.service.Customer;

import org.example.bank.domain.dto.CustomerDto;
import org.example.bank.domain.valueObjects.TypeIdentification;
import org.example.bank.domain.valueObjects.TypePerson;

import java.util.List;
import java.util.Optional;

public class CustomerService implements CustomerInterface{
    @Override
    public List<CustomerDto> fillData(List<CustomerDto> customerDto) {
        return null;
    }

    @Override
    public List<CustomerDto> listCustomer() {
        return null;
    }

    @Override
    public Optional<CustomerDto> findByIdCustomer(String id) {
        return Optional.empty();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return null;
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customerDto) {
        return null;
    }

    @Override
    public void deleteCustomer(String id) {

    }

    @Override
    public void deleteAllCustomer() {

    }

    @Override
    public List<CustomerDto> findByCustomerFirstName(String firstName) {
        return null;
    }

    @Override
    public List<CustomerDto> findByCustomerLastName(String lastName) {
        return null;
    }

    @Override
    public CustomerDto findByPhone(String phone) {
        return null;
    }

    @Override
    public CustomerDto findByEmail(String email) {
        return null;
    }

    @Override
    public List<CustomerDto> findByAge(String age) {
        return null;
    }

    @Override
    public List<CustomerDto> findByTypeIdentification(TypeIdentification typeIdentification) {
        return null;
    }

    @Override
    public CustomerDto findByNumberIdentification(String numberIdentification) {
        return null;
    }

    @Override
    public List<CustomerDto> findByTypePerson(TypePerson typePerson) {
        return null;
    }

    @Override
    public CustomerDto findByIdAccount(String idAccount) {
        return null;
    }
}
