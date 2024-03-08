package org.example.bank.application.service.Bank;

import org.example.bank.domain.dto.AccountDto;
import org.example.bank.domain.dto.BankDto;
import org.example.bank.domain.valueObjects.BranchOffice;
import org.example.bank.domain.valueObjects.Country;
import org.example.bank.domain.valueObjects.Status;
import org.example.bank.domain.valueObjects.TypeAccount;

import java.util.List;

public interface BankInterface {

    // Save all data
    List<BankDto> fillData(List<BankDto> bankDto);

    // save bank
    List<BankDto> listBanks();

    // find by country
    List<BankDto> findByCountry(Country country);

    // find by branch Office
    List<BankDto> findByBranchOffice(BranchOffice branchOffice);

    // find by Status
    List<BankDto> findByStatus(Status status);

    // find by status and country
    List<BankDto> findByStatusAndCountry(Status status, Country country);

    // find by Status and branch Office
    List<BankDto> findByStatusAndBranchOffice(Status status, BranchOffice branchOffice);
}
