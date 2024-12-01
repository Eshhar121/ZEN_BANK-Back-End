package edu.icet.service.impl;

import edu.icet.dto.Accounts;
import edu.icet.entity.AccountEntity;
import edu.icet.repository.AccountRepository;
import edu.icet.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    final AccountRepository repository;
    private final ModelMapper modelMapper;

    @Override
    public List<Accounts> getAll() {
        List<Accounts> accountsList = new ArrayList<>();
        repository.findAll().forEach(accountsEntity -> {
            accountsList.add(modelMapper.map(accountsEntity, Accounts.class));
        });
        return accountsList;
    }

    @Override
    public void addAccount(Accounts accounts) {
        repository.save(modelMapper.map(accounts, AccountEntity.class));
    }

    @Override
    public void deleteAccountByAccount_no(String accountNo) {
        repository.deleteById(accountNo);
    }

    @Override
    public List<Accounts> searchAccountByIdOrAccount_no(String accNoOrId) {
        List<Accounts> accountList = new ArrayList<>();
        repository.searchByIdOrAccountNo(accNoOrId,accNoOrId).forEach(AccountsEntity -> {
            accountList.add(modelMapper.map(AccountsEntity, Accounts.class));
        });
        return accountList;
    }

    @Override
    public void updateAccounts(Accounts accounts) {
        repository.save(modelMapper.map(accounts,AccountEntity.class));
    }
}
