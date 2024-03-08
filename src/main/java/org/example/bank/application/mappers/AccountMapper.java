package org.example.bank.application.mappers;

import org.example.bank.domain.collections.Account;
import org.example.bank.domain.dto.AccountDto;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class AccountMapper {

    public Function<Account, AccountDto> mapToDtoAccount(){

        return account -> new AccountDto(
                account.getId(),
                account.getStatus(),
                account.getDateCreation(),
                account.getTypeAccount(),
                account.getNumberAccount(),
                account.getBalance(),
                account.getDiscount(),
                account.getDiscountedBalance(),
                account.getIdTransaction()
        );
    }

    public Function<AccountDto, Account> mapToCollectionAccount(){

            return accountDto -> new Account(
                    accountDto.getId(),
                    accountDto.getStatus(),
                    accountDto.getDateCreation(),
                    accountDto.getTypeAccount(),
                    accountDto.getNumberAccount(),
                    accountDto.getBalance(),
                    accountDto.getDiscount(),
                    accountDto.getDiscountedBalance(),
                    accountDto.getIdTransaction()

            );
    }
}
