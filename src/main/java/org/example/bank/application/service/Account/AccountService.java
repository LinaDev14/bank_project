package org.example.bank.application.service.Account;

import org.example.bank.domain.dto.AccountDto;
import org.example.bank.domain.valueObjects.Status;
import org.example.bank.domain.valueObjects.TypeAccount;

import java.util.List;

public class AccountService implements AccountInterface{
    @Override
    public List<AccountDto> listAccounts() {
        return null;
    }

    @Override
    public AccountDto saveAccount(AccountDto accountDto) {
        return null;
    }

    @Override
    public List<AccountDto> fillData(List<AccountDto> accountDto) {
        return null;
    }

    @Override
    public AccountDto findById(String id) {
        return null;
    }

    @Override
    public AccountDto updateAccount(AccountDto accountDto) {
        return null;
    }

    @Override
    public List<AccountDto> findByStatus(Status status) {
        return null;
    }

    @Override
    public List<AccountDto> findByTypeAccount(TypeAccount typeAccount) {
        return null;
    }

    @Override
    public AccountDto findByAccountNumber(String numberAccount) {
        return null;
    }
}
