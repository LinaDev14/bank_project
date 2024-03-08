package org.example.bank.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.bank.domain.valueObjects.BranchOffice;
import org.example.bank.domain.valueObjects.Country;
import org.example.bank.domain.valueObjects.Status;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankDto {

    private String id;
    private String name;
    private String phone;
    private Country country;
    private BranchOffice branchOffice;
    private String idCustomer;
    private Status status;
}
