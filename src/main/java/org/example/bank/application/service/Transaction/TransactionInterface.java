package org.example.bank.application.service.Transaction;

import org.example.bank.domain.dto.TransactionDto;
import org.example.bank.domain.valueObjects.TypeTransaction;

import java.util.List;

public interface TransactionInterface {

    // findById
    TransactionDto findById(String id);

    // save all data
    List<TransactionDto> saveAllData(List<TransactionDto> transactionDto);

    // save transaction
    TransactionDto saveTransaction(TransactionDto transactionDto);

    // list type transaction
    List<TransactionDto> findByTypeTransaction(TypeTransaction typeTransaction);

}
