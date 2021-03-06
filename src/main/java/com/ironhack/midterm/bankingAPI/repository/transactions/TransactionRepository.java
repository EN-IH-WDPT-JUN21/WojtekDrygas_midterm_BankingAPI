package com.ironhack.midterm.bankingAPI.repository.transactions;

import com.ironhack.midterm.bankingAPI.dao.transactions.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
    @Query ("SELECT t FROM Transaction t WHERE sender_account_id = :id ORDER BY transactionDate Desc")
    List<Transaction> findBySenderOrderByTransactionDateDesc(Long id);
}
