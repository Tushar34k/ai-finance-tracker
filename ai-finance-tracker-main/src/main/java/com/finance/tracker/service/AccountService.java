package com.finance.tracker.service;

import com.finance.tracker.model.Account;

import java.util.List;

public interface AccountService {
    Account createAccount(Long userId, Account account);
    Account getAccountById(Long id);
    List<Account> getAccountsByUser(Long userId);
    Account updateAccount(Long id, Account account);
    void deleteAccount(Long id);
}