package org.example.bank.application.mappers;

import org.example.bank.domain.collections.Customer;
import org.example.bank.domain.dto.CustomerDto;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CustomerMapper {

    public Function<Customer, CustomerDto> mapToDtoCustomer(){

        return customer -> new CustomerDto(
                customer.getId(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getPhone(),
                customer.getEmail(),
                customer.getAddress(),
                customer.getAge(),
                customer.getTypeIdentification(),
                customer.getNumberIdentification(),
                customer.getTypePerson(),
                customer.getIdAccount()
        );
    }
    
    public Function<CustomerDto, Customer> mapToCollectionCustomer(){

        return customerDto -> new Customer(
                customerDto.getId(),
                customerDto.getFirstName(),
                customerDto.getLastName(),
                customerDto.getPhone(),
                customerDto.getEmail(),
                customerDto.getAddress(),
                customerDto.getAge(),
                customerDto.getTypeIdentification(),
                customerDto.getNumberIdentification(),
                customerDto.getTypePerson(),
                customerDto.getIdAccount()
        );
    }
}
