package com.ironhack.midterm.bankingAPI.repository.accounts;

import com.ironhack.midterm.bankingAPI.dao.accounts.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account,Long> {
    Optional<Account> findById(Long id);

}
