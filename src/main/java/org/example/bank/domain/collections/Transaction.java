package org.example.bank.domain.collections;

import lombok.Data;
import org.example.bank.domain.valueObjects.TypeTransaction;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(value = "Transactions")
public class Transaction {

    @Id
    private final String id;
    private final Date dateTransaction;
    private final TypeTransaction typeTransaction;
    private final String sourceAccount;
    private final String destinationAccount;

}
