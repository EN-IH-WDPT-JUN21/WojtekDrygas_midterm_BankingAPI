package com.ironhack.midterm.bankingAPI.dao.transactions;

import com.ironhack.midterm.bankingAPI.dao.accounts.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "sender_account_id")
    private Account sender;
    @ManyToOne
    @JoinColumn(name = "receiver_account_id")
    private Account receiver;
    private Date transactionDate;
    private BigDecimal amountTransferred;

    public Transaction(Account sender, Account receiver, BigDecimal amountTransferred) {
        this.sender = sender;
        this.receiver = receiver;
        this.amountTransferred = amountTransferred;
        transactionDate = new Date();
    }
}
