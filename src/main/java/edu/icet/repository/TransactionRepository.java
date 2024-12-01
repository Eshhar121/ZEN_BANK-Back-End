package edu.icet.repository;
import edu.icet.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<TransactionEntity,String> {
    List<TransactionEntity> findByReceiverAccNoOrSenderAccNo(String ReceiverAcc,String SenderAccNo);
}
