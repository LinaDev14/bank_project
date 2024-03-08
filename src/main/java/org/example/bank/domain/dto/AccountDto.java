package org.example.bank.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.bank.domain.valueObjects.Status;
import org.example.bank.domain.valueObjects.TypeAccount;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {

    private String id;
    private Status status;
    private String dateCreation;
    private TypeAccount typeAccount;
    private String numberAccount;
    private Integer balance;
    private Integer discount;
    private Integer discountedBalance;
    private String IdTransaction;
}
