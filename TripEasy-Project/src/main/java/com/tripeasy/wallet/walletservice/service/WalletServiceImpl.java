package com.tripeasy.wallet.walletservice.service;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripeasy.wallet.walletservice.entity.Statement;
import com.tripeasy.wallet.walletservice.entity.Wallet;
import com.tripeasy.wallet.walletservice.repository.StatementRepository;
import com.tripeasy.wallet.walletservice.repository.WalletRepository;

@Service
public class WalletServiceImpl implements WalletService {
	@Autowired
	WalletRepository walletRepository;

	@Autowired
	StatementRepository statementRepository;

	@Override
	public Optional<Wallet> getTransactionById(int transactionId) {
		return walletRepository.findById(transactionId);

	}

	@Override
	public Double getCurrentBalance(Integer profileId) {
		return walletRepository.findById(profileId).get().getCurrentBalance();

	}

	@Override
	public void updateAccount(Wallet wallet) {
		statementRepository.saveAll(wallet.getStatements());
		walletRepository.save(wallet);

	}

	@Transactional
	@Override
	public Double withdraw(Wallet wallet, Double amount, String transactionRemarks, String transactionType) {
		Double currentBalance1 = wallet.getCurrentBalance();
		Statement statement = new Statement();
		wallet.setCurrentBalance(currentBalance1 -= amount);
		statement.setAmount(amount);
		statement.setDateTime(LocalDateTime.now());
		statement.setWallet(wallet);
		// transaction.setStatementId(statementId);
		statement.setTransactionRemarks(transactionRemarks);
		statement.setTransactionType(transactionType);
		statementRepository.save(statement);
		walletRepository.save(wallet);
		return currentBalance1;
	}

	@Override
	public Double deposit(Wallet wallet, Double amount, String transactionRemarks, String transactionType) {
		Double currentBalance1 = wallet.getCurrentBalance();
		Statement statement = new Statement();
		wallet.setCurrentBalance(currentBalance1 + amount);
		statement.setAmount(amount);
		statement.setDateTime(LocalDateTime.now());
		statement.setTransactionRemarks(transactionRemarks);
		statement.setTransactionType(transactionType);
		statementRepository.save(statement);
		walletRepository.save(wallet);
		return currentBalance1;
		/*
		 * if (amount > 0) { currentBalance += amount; }
		 */
	}

	@Override
	public void addNewAccount(Wallet wallet) {
		walletRepository.save(wallet);

	}

	@Override
	public Optional<Wallet> getWalletById(Integer profileId) {
		return walletRepository.findById(profileId);
	}

}
