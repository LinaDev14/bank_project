package org.example.bank.application.service.Bank;

import org.example.bank.domain.dto.BankDto;
import org.example.bank.domain.valueObjects.BranchOffice;
import org.example.bank.domain.valueObjects.Country;
import org.example.bank.domain.valueObjects.Status;

import java.util.List;

public class BankService implements BankInterface{
    @Override
    public List<BankDto> fillData(List<BankDto> bankDto) {
        return null;
    }

    @Override
    public List<BankDto> listBanks() {
        return null;
    }

    @Override
    public List<BankDto> findByCountry(Country country) {
        return null;
    }

    @Override
    public List<BankDto> findByBranchOffice(BranchOffice branchOffice) {
        return null;
    }

    @Override
    public List<BankDto> findByStatus(Status status) {
        return null;
    }

    @Override
    public List<BankDto> findByStatusAndCountry(Status status, Country country) {
        return null;
    }

    @Override
    public List<BankDto> findByStatusAndBranchOffice(Status status, BranchOffice branchOffice) {
        return null;
    }
}
