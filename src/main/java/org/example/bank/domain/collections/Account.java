package org.example.bank.domain.collections;

import lombok.Data;
import org.example.bank.domain.valueObjects.Status;
import org.example.bank.domain.valueObjects.TypeAccount;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "Accounts")
public class Account {

    @Id
    private final String id;

    private final Status status;
    private final String dateCreation;
    private final TypeAccount typeAccount;
    private final String numberAccount;
    private final Integer balance;
    private final Integer discount;
    private final Integer discountedBalance;
}
