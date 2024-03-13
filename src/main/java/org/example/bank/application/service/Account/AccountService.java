package org.example.bank.application.service.Account;

import lombok.RequiredArgsConstructor;
import org.example.bank.application.mappers.AccountMapper;
import org.example.bank.domain.collections.Account;
import org.example.bank.domain.dto.AccountDto;
import org.example.bank.domain.repository.AccountRepository;
import org.example.bank.domain.utlis.MessageResponse;
import org.example.bank.domain.valueObjects.Status;
import org.example.bank.domain.valueObjects.TypeAccount;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class AccountService implements AccountInterface{

    // mapper
    private final AccountRepository accountRepository;

    // repository
    private final AccountMapper accountMapper;

    @Override
    public List<AccountDto> listAccounts() {
        return accountRepository.findAll()
                .stream()
                .map(accountMapper.mapToDtoAccount())
                .collect(Collectors.toList());
    }

    @Override
    public AccountDto saveAccount(AccountDto accountDto) {
        return accountMapper.mapToDtoAccount()
                .apply(accountRepository.save(accountMapper.mapToCollectionAccount()
                        .apply(accountDto)));
    }

    @Override
    public List<AccountDto> fillData(List<AccountDto> accountDto) {
        return accountRepository.saveAll(accountDto.stream()
                .map(accountMapper.mapToCollectionAccount())
                .toList())
                .stream()
                .map(accountMapper.mapToDtoAccount())
                .collect(Collectors.toList());
    }

    @Override
    public Optional<AccountDto> findById(String id) {
        return accountRepository.findById(id)
                .map(accountMapper.mapToDtoAccount());
    }

    @Override
    public AccountDto updateAccount(AccountDto accountDto) {

        Account account = accountRepository
                .findById(accountDto.getId())
                .orElseThrow(() -> new IllegalArgumentException(MessageResponse.ACCOUNT_NOT_FOUND));

        Account accountToSave = accountMapper.mapToCollectionAccount()
                .apply(accountDto);

        Account savedAccount = accountRepository.save(accountToSave);

        return accountMapper.mapToDtoAccount()
                .apply(savedAccount);
    }

    @Override
    public List<AccountDto> findByStatus(Status status) {

      return accountRepository.findAll()
              .stream()
              .map(accountMapper.mapToDtoAccount())
              .collect(Collectors.toList());
    }

    @Override
    public List<AccountDto> findByTypeAccount(TypeAccount typeAccount) {
        return accountRepository.findAll()
                .stream()
                .map(accountMapper.mapToDtoAccount())
                .collect(Collectors.toList());
    }


}
