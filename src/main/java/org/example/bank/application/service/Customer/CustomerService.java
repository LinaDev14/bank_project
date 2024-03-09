package org.example.bank.application.service.Customer;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.bank.application.mappers.CustomerMapper;
import org.example.bank.domain.collections.Customer;
import org.example.bank.domain.dto.CustomerDto;
import org.example.bank.domain.repository.CustomerRepository;
import org.example.bank.domain.utlis.MessageResponse;
import org.example.bank.domain.valueObjects.TypeIdentification;
import org.example.bank.domain.valueObjects.TypePerson;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerService implements CustomerInterface{

    // repository
    private final CustomerRepository customerRepository;

    //mapper
    private final CustomerMapper customerMapper;
    @Override
    public List<CustomerDto> fillData(List<CustomerDto> customerDto) {
        return customerRepository.saveAll(customerDto.stream()
                .map(customerMapper.mapToCollectionCustomer())
                .toList())
                .stream()
                .map(customerMapper.mapToDtoCustomer())
                .collect(Collectors.toList());
    }

    @Override
    public List<CustomerDto> listCustomer() {
        return customerRepository.findAll()
                .stream()
                .map(customerMapper.mapToDtoCustomer())
                .collect(Collectors.toList());
    }

    @Override
    public Optional<CustomerDto> findByIdCustomer(String id) {
        return customerRepository.findById(id)
                .map(customerMapper.mapToDtoCustomer());
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {

        return customerMapper.mapToDtoCustomer()
                .apply(customerRepository.save(customerMapper.mapToCollectionCustomer()
                        .apply(customerDto)));
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customerDto) {

        Customer customer = customerRepository
                .findById(customerDto.getId())
                .orElseThrow(() -> new IllegalArgumentException(MessageResponse.CUSTOMER_NOT_FOUND));

        Customer customerToSave = customerMapper.mapToCollectionCustomer().apply(customerDto);
        Customer savedCustomer = customerRepository.save(customerToSave);

        return customerMapper.mapToDtoCustomer()
                .apply(savedCustomer);

    }

    @Override
    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void deleteAllCustomer() {
        customerRepository.deleteAll();
    }

    @Override
    public List<CustomerDto> findByCustomerFirstName(String firstName) {
        return customerRepository.findCustomerByFirstNameContainingIgnoreCaseOrderByFirstName(firstName)
                .stream()
                .map(customerMapper.mapToDtoCustomer())
                .collect(Collectors.toList());
    }

    @Override
    public List<CustomerDto> findByCustomerLastName(String lastName) {
        return customerRepository.findCustomerByLastNameContainingIgnoreCaseOrderByFirstName(lastName)
                .stream()
                .map(customerMapper.mapToDtoCustomer())
                .collect(Collectors.toList());
    }

    @Override
    public Optional<CustomerDto> findCustomerByPhone(String phone) {
        return customerRepository.findCustomerByPhone(phone)
                .map(customerMapper.mapToDtoCustomer());

    }
    @Override
    public Optional<CustomerDto> findByIdAccount(String idAccount) {
        return customerRepository.findCustomerByIdAccount(idAccount)
                .map(customerMapper.mapToDtoCustomer());
    }
}
