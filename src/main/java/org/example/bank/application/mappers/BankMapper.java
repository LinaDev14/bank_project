package org.example.bank.application.mappers;

import org.example.bank.domain.collections.Bank;
import org.example.bank.domain.dto.BankDto;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class BankMapper {

    public Function<Bank, BankDto> mapToDtoBank(){

        return bank -> new BankDto(
                bank.getId(),
                bank.getName(),
                bank.getPhone(),
                bank.getCountry(),
                bank.getBranchOffice(),
                bank.getIdCustomer()
        );
    }

    public Function<BankDto, Bank> mapToCollectionBank(){

        return bankDto -> new Bank(
                bankDto.getId(),
                bankDto.getName(),
                bankDto.getPhone(),
                bankDto.getCountry(),
                bankDto.getBranchOffice(),
                bankDto.getIdCustomer()
        );
    }
}
