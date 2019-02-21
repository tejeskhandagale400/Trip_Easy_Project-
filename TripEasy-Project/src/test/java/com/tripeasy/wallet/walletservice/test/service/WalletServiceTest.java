package com.tripeasy.wallet.walletservice.test.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.tripeasy.wallet.walletservice.entity.Statement;
import com.tripeasy.wallet.walletservice.entity.Wallet;
//import com.tripeasy.wallet.walletservice.service.WalletService;

/*@RunWith(SpringRunner.class)*/
/*@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)*/
public class WalletServiceTest {
	/*
	 * @Autowired WalletService service;
	 * 
	 * 
	 * @Test public void createNewWalletTest(Integer profileId, Double
	 * currentBalance) { Wallet wallet = new Wallet(101, 200.00); Set<Statement> s =
	 * new LinkedHashSet<Statement>(); s.add(new Statement<Wallet>(1, "atm",
	 * 15550.00, LocalDateTime.now(), 101, "Gift"));
	 * 
	 * s.add(new Statement(1, "atm", 1000.00, LocalDateTime.now(), "Gift"));
	 * s.add(new Statement(2, "atm", 1000.00, LocalDateTime.now(), "Gift"));
	 * s.add(new Statement(3, "atm", 1000.00, LocalDateTime.now(), "Gift"));
	 * s.add(new Statement(4, "atm", 1000.00, LocalDateTime.now(), "Gift"));
	 * s.add(new Statement(5, "atm", 1000.00, LocalDateTime.now(), "Gift"));
	 * s.add(new Statement(6, "atm", 1000.00, LocalDateTime.now(), "Gift"));
	 * 
	 * // wallet.setStatement(s);
	 * 
	 * }
	 * 
	 * 
	 * @Test public void currentBalanceTest1(double currentBalance) { if
	 * (currentBalance < 0) ; assertTrue(false);
	 * 
	 * double actual = service.getCurrentBalance(101); double expected=2000.00;
	 * assertEquals(200.00, actual);
	 * 
	 * }
	 * 
	 * @Test public void invalidUserTest( int profileId ) {
	 * 
	 * if (profileId < 0) ; else if (profileId != profileId) {
	 * 
	 * }
	 * 
	 * assertTrue(true);
	 * 
	 * }
	 * 
	 * @Test public void invalidUserTest() { Wallet wallet=new Wallet();
	 * wallet.setCurrentBalance(1000.00); wallet.setProfileId(101);
	 * 
	 * }
	 * 
	 * 
	 * @Test public void validUserTest(int profileId) { Wallet wallet = new
	 * Wallet(profileId, null, null); Set<Statement> set = new
	 * LinkedHashSet<Statement>(); // set.add(101); wallet.setprofileId(profileId);
	 * 
	 * }
	 * 
	 * @Test public void invalidInputTest(double amount, double currentBalance) { if
	 * (amount < 0 && amount > currentBalance) ; assertTrue(true); ; }
	 * 
	 * @Test public void negativeInputTest(double amount) { if (amount < 0) ;
	 * assertFalse(true); }
	 * 
	 * @Test public void emptyWalletTest() { List<Wallet> wallet =
	 * service.wallet.addAll(null); assertEquals(0, profileId);
	 * fail("Not yet implemented"); }
	 * 
	 */
}
