package edu.icet.controller;

import edu.icet.dto.Accounts;
import edu.icet.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
@CrossOrigin
public class AccountController {

    final AccountService accountService;

    @GetMapping("/all")
    public List<Accounts> getUsers(){
        return accountService.getAll();
    }

    @PostMapping("/add-account")
    public void addUser(@RequestBody Accounts accounts){
        accountService.addAccount(accounts);
    }

    @PutMapping("/update-account")
    public void updateAccount(@RequestBody Accounts accounts){
        accountService.updateAccounts(accounts);
    }

    @DeleteMapping("delete-account/{acc_no}")
    public void deleteAccount(@PathVariable String acc_no){
        accountService.deleteAccountByAccount_no(acc_no);
    }

    @GetMapping("/search-account/{idOrAccNo}")
    public List<Accounts> searchAccountById(@PathVariable String idOrAccNo){
        return accountService.searchAccountByIdOrAccount_no(idOrAccNo);
    }
}
