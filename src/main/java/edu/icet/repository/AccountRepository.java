package edu.icet.repository;

import edu.icet.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<AccountEntity,Integer> {
    List<AccountEntity> searchByIdOrAccountNo(String Id, String accNo);
    void deleteById(String accountNo);
}
