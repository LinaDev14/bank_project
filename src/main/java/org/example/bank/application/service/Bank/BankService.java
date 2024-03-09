package org.example.bank.application.service.Bank;

import lombok.RequiredArgsConstructor;
import org.example.bank.application.mappers.BankMapper;
import org.example.bank.domain.dto.BankDto;
import org.example.bank.domain.repository.BankRepository;
import org.example.bank.domain.valueObjects.BranchOffice;
import org.example.bank.domain.valueObjects.Country;
import org.example.bank.domain.valueObjects.Status;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
public class BankService implements BankInterface{

    // mapper
    private final BankRepository bankRepository;

    // repository
    private final BankMapper bankMapper;

    @Override
    public List<BankDto> fillData(List<BankDto> bankDto) {
        return bankRepository.saveAll(bankDto.stream()
                .map(bankMapper.mapToCollectionBank())
                .toList())
                .stream()
                .map(bankMapper.mapToDtoBank())
                .collect(Collectors.toList());
    }

    @Override
    public List<BankDto> listBanks() {
        return bankRepository.findAll()
                .stream()
                .map(bankMapper.mapToDtoBank())
                .collect(Collectors.toList());
    }

    @Override
    public List<BankDto> findByCountry(Country country) {
        return bankRepository.findAll()
                .stream()
                .map(bankMapper.mapToDtoBank())
                .collect(Collectors.toList());
    }

    @Override
    public List<BankDto> findByBranchOffice(BranchOffice branchOffice) {
        return bankRepository.findAll()
                .stream()
                .map(bankMapper.mapToDtoBank())
                .collect(Collectors.toList());
    }

}
