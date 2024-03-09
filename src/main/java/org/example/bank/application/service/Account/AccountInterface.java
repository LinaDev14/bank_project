package org.example.bank.application.service.Account;

import org.example.bank.domain.dto.AccountDto;
import org.example.bank.domain.valueObjects.Status;
import org.example.bank.domain.valueObjects.TypeAccount;

import java.util.List;
import java.util.Optional;

public interface AccountInterface {

    // List accounts
    List<AccountDto> listAccounts();

    // create account
    AccountDto saveAccount(AccountDto accountDto);

    // save all data
    List<AccountDto> fillData(List<AccountDto> accountDto);

    // find by id
    Optional<AccountDto> findById(String id);

    // updated account
    AccountDto updateAccount(AccountDto accountDto);

    // find by status
    List<AccountDto> findByStatus(Status status);

    // find by type account
    List<AccountDto> findByTypeAccount(TypeAccount typeAccount);

    // find by number account
    Optional<AccountDto> findByAccountNumber(String numberAccount);

}
