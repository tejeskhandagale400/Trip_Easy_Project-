package com.tripeasy.wallet.walletservice.service;

import java.sql.SQLException;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.tripeasy.wallet.walletservice.entity.Wallet;

@Service
public interface WalletService {

	Optional<Wallet> getTransactionById(int transactionId);

	Double getCurrentBalance(Integer profileId);

	public void addNewAccount(Wallet wallet);

	Optional<Wallet> getWalletById(Integer profileId);

	void updateAccount(Wallet wallet);

	Double withdraw(Wallet wallet, Double amount, String transactionRemarks, String transactionType);

	Double deposit(Wallet wallet, Double amount, String transactionRemarks, String transactionType);

}