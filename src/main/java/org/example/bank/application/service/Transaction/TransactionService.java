package org.example.bank.application.service.Transaction;

import lombok.RequiredArgsConstructor;
import org.example.bank.application.mappers.TransactionMapper;
import org.example.bank.domain.dto.TransactionDto;
import org.example.bank.domain.repository.TransactionRepository;
import org.example.bank.domain.valueObjects.TypeTransaction;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class TransactionService implements TransactionInterface{

    // mapper
    private final TransactionMapper transactionMapper;

    // repository
    private final TransactionRepository transactionRepository;
    @Override
    public Optional<TransactionDto> findById(String id) {
        return transactionRepository.findById(id)
                .map(transactionMapper.mapToDtoTransaction());
    }

    @Override
    public List<TransactionDto> saveAllData(List<TransactionDto> transactionDto) {

        return transactionRepository.saveAll(transactionDto.stream()
                .map(transactionMapper.mapToCollectionTransaction())
                        .toList())
                .stream()
                .map(transactionMapper.mapToDtoTransaction())
                .collect(Collectors.toList());
    }

    @Override
    public TransactionDto saveTransaction(TransactionDto transactionDto) {

        return transactionMapper.mapToDtoTransaction()
                .apply(transactionRepository.save(transactionMapper.mapToCollectionTransaction()
                        .apply(transactionDto)));
    }

    @Override
    public List<TransactionDto> findByTypeTransaction(TypeTransaction typeTransaction) {

        return transactionRepository.findAll()
                .stream()
                .map(transactionMapper.mapToDtoTransaction())
                .collect(Collectors.toList());
    }
}
