package org.example.bank.domain.collections;

import lombok.Data;
import org.example.bank.domain.valueObjects.TypeIdentification;
import org.example.bank.domain.valueObjects.TypePerson;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(value = "Customers")
public class Customer {

    @Id
    private final String id;

    private final String firstName;
    private final String lastName;
    private final String phone;
    private final String email;
    private final String address;
    private final String age;
    private final TypeIdentification typeIdentification;
    private final String numberIdentification;
    private final TypePerson typePerson;

}
