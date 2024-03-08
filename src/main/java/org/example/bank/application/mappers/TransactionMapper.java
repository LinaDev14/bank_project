package org.example.bank.application.mappers;

import org.example.bank.domain.collections.Transaction;
import org.example.bank.domain.dto.TransactionDto;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class TransactionMapper {

    public Function<Transaction, TransactionDto> mapToDtoTransaction(){

        return transaction -> new TransactionDto(
                transaction.getId(),
                transaction.getDateTransaction(),
                transaction.getTypeTransaction(),
                transaction.getSourceAccount(),
                transaction.getDestinationAccount()
        );
    }


    public Function<TransactionDto, Transaction> mapToCollectionTransaction(){

        return transactionDto -> new Transaction(
                transactionDto.getId(),
                transactionDto.getDateTransaction(),
                transactionDto.getTypeTransaction(),
                transactionDto.getSourceAccount(),
                transactionDto.getDestinationAccount()
        );
    }
}
