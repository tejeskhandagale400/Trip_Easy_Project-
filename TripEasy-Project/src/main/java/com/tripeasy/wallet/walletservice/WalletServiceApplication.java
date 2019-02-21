package com.tripeasy.wallet.walletservice;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tripeasy.wallet.walletservice.entity.Statement;
import com.tripeasy.wallet.walletservice.entity.Wallet;
import com.tripeasy.wallet.walletservice.repository.WalletRepository;

@SpringBootApplication
public class WalletServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner populateData(WalletRepository repository) {
		Set<Statement> set = new LinkedHashSet<Statement>();

		Statement s = new Statement(1, null, "Debit", 1570.00, LocalDateTime.now(), 1, "Flight Booking");

		set.add(s);
		Wallet wallet = new Wallet(1, 1000000.00, set);
		Wallet wallet2 = new Wallet(2, 1000000.00, set);
		Wallet wallet3 = new Wallet(3, 1000000.00, set);

		return (args) -> {
			repository.save(wallet);
			repository.save(wallet2);
			repository.save(wallet3);
		};

	}
}
