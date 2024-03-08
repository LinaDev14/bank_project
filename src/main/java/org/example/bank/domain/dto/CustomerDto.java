package org.example.bank.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.bank.domain.valueObjects.TypeIdentification;
import org.example.bank.domain.valueObjects.TypePerson;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {


    private String id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    private String age;
    private TypeIdentification typeIdentification;
    private String numberIdentification;
    private TypePerson typePerson;
    private String IdAccount;
}
