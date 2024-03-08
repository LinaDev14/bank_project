package org.example.bank.application.service.Transaction;

import org.example.bank.domain.dto.TransactionDto;
import org.example.bank.domain.valueObjects.TypeTransaction;

import java.util.List;

public class TransactionService implements TransactionInterface{
    @Override
    public TransactionDto findById(String id) {
        return null;
    }

    @Override
    public List<TransactionDto> saveAllData(List<TransactionDto> transactionDto) {
        return null;
    }

    @Override
    public TransactionDto saveTransaction(TransactionDto transactionDto) {
        return null;
    }

    @Override
    public List<TransactionDto> findByTypeTransaction(TypeTransaction typeTransaction) {
        return null;
    }
}
