package org.example.bank.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.bank.domain.valueObjects.TypeTransaction;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDto {

    private String id;
    private Date dateTransaction;
    private TypeTransaction typeTransaction;
    private String sourceAccount;
    private String destinationAccount;
}
