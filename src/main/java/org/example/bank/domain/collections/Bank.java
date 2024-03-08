package org.example.bank.domain.collections;

import lombok.Data;
import org.example.bank.domain.valueObjects.BranchOffice;
import org.example.bank.domain.valueObjects.Country;
import org.example.bank.domain.valueObjects.Status;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "Banks")
public class Bank {

    private final String id;
    private final String name;
    private final String phone;
    private final Country country;
    private final BranchOffice branchOffice;
    private final String idCustomer;
    private final Status status;

}
