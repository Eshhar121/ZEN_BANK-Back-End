package edu.icet.service;

import edu.icet.dto.Transaction;
import edu.icet.dto.User;

import java.util.List;

public interface TransactionService {
    List<Transaction> getAll();
    void addTransaction(Transaction transaction);
    void deleteTransactionById(String acc_no);
    List<Transaction> searchTransactionBySenderOrReceiverAccNo(String acc_no);
}
