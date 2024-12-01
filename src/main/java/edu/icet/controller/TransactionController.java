package edu.icet.controller;

import edu.icet.dto.Transaction;
import edu.icet.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
@RequiredArgsConstructor
@CrossOrigin
public class TransactionController {

    final TransactionService transactionService;

    @GetMapping("/all")
    public List<Transaction> getTransaction(){
        return transactionService.getAll();
    }

    @PostMapping("/add-transaction")
    public void addTransaction(@RequestBody Transaction transaction){
        transactionService.addTransaction(transaction);
    }

    @DeleteMapping("delete-transaction/{id}")
    public void deleteTransactionById(@PathVariable String id){
        transactionService.deleteTransactionById(id);
    }

    @GetMapping("/search-transaction/{acc_no}")
    public List<Transaction> searchTransactionBySenderOrReceiverAccNo(@PathVariable String acc_no){
        return transactionService.searchTransactionBySenderOrReceiverAccNo(acc_no);
    }
}
