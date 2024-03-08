package org.example.bank.domain.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.bank.domain.collections.Account;
import org.example.bank.domain.valueObjects.Status;
import org.example.bank.domain.valueObjects.TypeAccount;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface AccountRepository extends MongoRepository<Account, String> {

}
