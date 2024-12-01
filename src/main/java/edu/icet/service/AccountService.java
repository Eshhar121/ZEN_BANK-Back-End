package edu.icet.service;

import edu.icet.dto.Accounts;

import java.util.List;

public interface AccountService {

    List<Accounts> getAll();
    void addAccount(Accounts accounts);
    void deleteAccountByAccount_no(String accountNo);
    List<Accounts> searchAccountByIdOrAccount_no(String accNoOrId);
    void updateAccounts(Accounts accounts);
}
