package edu.icet.service.impl;

import edu.icet.dto.Transaction;
import edu.icet.entity.TransactionEntity;
import edu.icet.repository.TransactionRepository;
import edu.icet.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    final TransactionRepository repository;
    private final ModelMapper modelMapper;

    @Override
    public List<Transaction> getAll() {
        List<Transaction> transactionList = new ArrayList<>();
        repository.findAll().forEach(transactionEntity -> {
            transactionList.add(modelMapper.map(transactionEntity, Transaction.class));
        });
        return transactionList;
    }

    @Override
    public void addTransaction(Transaction transaction) {
        repository.save(modelMapper.map(transaction, TransactionEntity.class));
    }

    @Override
    public void deleteTransactionById(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Transaction> searchTransactionBySenderOrReceiverAccNo(String acc_no) {
        List<Transaction> transactionList = new ArrayList<>();
        repository.findByReceiverAccNoOrSenderAccNo(acc_no,acc_no).forEach(transactionEntity -> {
            transactionList.add(modelMapper.map(transactionEntity, Transaction.class));
        });
        return transactionList;
    }
}
