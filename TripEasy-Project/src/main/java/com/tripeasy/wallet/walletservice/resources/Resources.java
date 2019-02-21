package com.tripeasy.wallet.walletservice.resources;

import java.util.Optional;
import java.util.Set;

import org.omg.IOP.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tripeasy.wallet.walletservice.entity.Statement;
import com.tripeasy.wallet.walletservice.entity.Wallet;
import com.tripeasy.wallet.walletservice.service.WalletService;

@RestController
@RequestMapping("/wallet")
public class Resources {
	@Autowired
	private WalletService walletService;

	@PutMapping("/{profileId}")
	public ResponseEntity<Double> AddMoney(@PathVariable Integer profileId, @RequestParam Double amount,
			@RequestParam String transactionRemarks, @RequestParam String transactionType) {

		Wallet wallet = walletService.getWalletById(profileId).get();
		walletService.deposit(wallet, amount, transactionRemarks, "credit");
		Wallet wallet1 = walletService.getWalletById(profileId).get();
		return new ResponseEntity<Double>(wallet1.getCurrentBalance(), HttpStatus.OK);

	}

	@PostMapping("/payMoney")
	public ResponseEntity<Double> SendMoney(@RequestParam int senderProfileId, @RequestParam int receiverProfileId,
			@RequestParam Double amount, @RequestParam String transactionRemarks,
			@RequestParam String transactionType) {
		Wallet walletProfile = walletService.getWalletById(senderProfileId).get();
		Wallet walletAdmin = walletService.getWalletById(receiverProfileId).get();

		if (walletProfile.getCurrentBalance() >= amount) {
			walletService.withdraw(walletProfile, amount, transactionRemarks, "Debit");
			walletService.deposit(walletAdmin, amount, transactionRemarks, "Credit");
			return new ResponseEntity<Double>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Double>(HttpStatus.EXPECTATION_FAILED);
		}

	}

	
	  @GetMapping public ResponseEntity<Set<Statement>> getStatement(@RequestParam
	  Integer profileId) { Optional<Wallet> wallet =
	  walletService.getWalletById(profileId); Set<Statement> statement1 =
	  wallet.get().getStatements(); return new
	  ResponseEntity<Set<Statement>>(statement1, HttpStatus.OK);
	  
	  }
	 

	@GetMapping("getWallet")
	public ResponseEntity<Wallet> getWallet(@RequestParam Integer profileId) {
		Optional<Wallet> wallet = walletService.getWalletById(profileId);
		return new ResponseEntity<Wallet>(wallet.get(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<TransactionService> AddWallet(@RequestBody Wallet wallet) {
		walletService.addNewAccount(wallet);
		return new ResponseEntity<TransactionService>(HttpStatus.CREATED);
	}

	/*
	 * @PutMapping public ResponseEntity<TransactionService> SendMoney(@PathVariable
	 * int profileId,
	 * 
	 * @RequestParam("currentBalance") Double currentBalance) { Optional<Wallet>
	 * wallet = walletService.getTransactionById(profileId);
	 * wallet.get().setCurrentBalance(currentBalance);
	 * walletService.updateAccount(wallet.get()); return null; }
	 */
}
/*
 * public ResponseEntity<Transaction> deposit(@RequestBody Transaction
 * transaction){ ResponseEntity<Double> balance
 * =restTemplate.getForEntity("http://AccountService/accounts/"+transaction.
 * getAccountNumber()+"/balance", Double.class); double currentBalance
 * =balance.getBody(); double updatedBalance
 * =service.deposit(transaction.getAccountNumber(), transaction.getAmount(),
 * currentBalance, TransactionType.DEPOSIT);
 * restTemplate.put("http://AccountService/accounts/"+transaction.
 * getAccountNumber()+"?currentBalance="+updatedBalance, null); return new
 * ResponseEntity<>(HttpStatus.OK); }
 */

/*
 * public void updateBalance(@PathVariable int
 * accountId, @RequestParam("currentBalance") double currentBalance) {
 * SavingsAccount savingsAccount = accountService.getAccountById(accountId);
 * savingsAccount.setCurrentBalance(currentBalance);
 * accountService.updateBalance(savingsAccount); }
 */
/*
 * @GetMapping public ResponseEntity<List<Booking>> getListOfAllBookings() {
 * List<Booking> bookings = bookingService.getAllBookings(); if (bookings ==
 * null) { return new ResponseEntity<>(bookings, HttpStatus.NOT_FOUND); } return
 * new ResponseEntity<>(bookings, HttpStatus.OK); }
 */
/*
 * @GetMapping public ResponseEntity<List<SavingsAccount>> getListOfAccounts(){
 * List<SavingsAccount> accounts = accountService.getListOfAccounts();
 * if(accounts == null) { return new ResponseEntity<>(accounts ,
 * HttpStatus.NOT_FOUND); } return new ResponseEntity<>(accounts ,
 * HttpStatus.OK); }
 */
