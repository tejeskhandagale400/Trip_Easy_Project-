package com.tripeasy.wallet.walletservice.test.resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.tripeasy.wallet.walletservice.entity.Statement;
import com.tripeasy.wallet.walletservice.entity.Wallet;

/*@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)*/
public class WalletResourceTest {
	/*
	 * @Autowired private TestRestTemplate template;
	 * 
	 * @Test public void toCheckGetWalletSuccess() { ResponseEntity<Statement[]>
	 * entity = template.getForEntity("/transactions", Statement[].class);
	 * assertEquals(HttpStatus.OK,entity.getStatusCode()); }
	 * 
	 * @Test public void toCheckGetWalletFail() { ResponseEntity<String> entity =
	 * template.getForEntity("/transactions", String.class); assertEquals(
	 * HttpStatus.NOT_FOUND,entity.getStatusCode()); }
	 * 
	 * @Test public void toCheckGetByWalletIdSuccess() { ResponseEntity<String>
	 * entity = template.getForEntity("/transactions/1", String.class);
	 * assertEquals( HttpStatus.OK,entity.getStatusCode()); }
	 * 
	 * @Test public void toCheckGetByWalletIdFailure() { ResponseEntity<String>
	 * entity = template.getForEntity("/transactions/1", String.class);
	 * assertEquals(HttpStatus.METHOD_NOT_ALLOWED,entity.getStatusCode()); }
	 * 
	 * 
	 * @Test public void toCheckAddWalletSuccess() { Wallet wallet = new Wallet(1,
	 * 100.0); ResponseEntity<String> entity =
	 * template.postForEntity("/transactions", wallet, String.class); assertEquals(
	 * HttpStatus.OK,entity.getStatusCode()); }
	 * 
	 * @Test public void toCheckAddWalletFailure() { Wallet wallet = new Wallet(1,
	 * 100.0); ResponseEntity<String> entity =
	 * template.postForEntity("/transactions", wallet, String.class); assertEquals(
	 * HttpStatus.NOT_FOUND,entity.getStatusCode()); }
	 * 
	 * @Test public void toCheckAddMoneySuccess() {
	 * template.put("/transactions/1?currentBalance=" + 100, null);
	 * ResponseEntity<Wallet> entity = template.getForEntity("/transactions/1",
	 * Wallet.class); assertEquals(entity.getBody().getCurrentBalance(), 500, 0); }
	 * 
	 * @Test public void toCheckAddMoneyFailure() {
	 * template.put("/transactions/1?currentBalance=" + 0, null);
	 * ResponseEntity<Wallet> entity = template.getForEntity("/transactions/1",
	 * Wallet.class); assertNotEquals(entity.getBody().getCurrentBalance(), 300, 0);
	 * }
	 * 
	 * @Test public void toCheckPayMoneySuccess() {
	 * template.put("/transactions/1/add?currentBalance=" + 100.0, null);
	 * ResponseEntity<Wallet> entity = template.getForEntity("/transactions/1",
	 * Wallet.class); assertEquals(entity.getBody().getCurrentBalance(), 300.0, 0);
	 * }
	 * 
	 * @Test public void toCheckGetStatementsSuccess() { ResponseEntity<Set> entity
	 * = template.getForEntity("/transactions", Set.class);
	 * 
	 * assertEquals(HttpStatus.OK,entity.getStatusCode()); }
	 * 
	 * @Test public void toCheckGetStatementsFailure() { ResponseEntity<String>
	 * entity = template.getForEntity("/transactions/statement", String.class);
	 * assertEquals(HttpStatus.METHOD_NOT_ALLOWED,entity.getStatusCode()); }
	 * 
	 * @Test public void toCheckGetStatementsByIdSuccess() { ResponseEntity<String>
	 * entity = template.getForEntity("/transactions/statements/1", String.class);
	 * assertEquals( HttpStatus.OK,entity.getStatusCode()); }
	 */

	}
	/*
	 * @Test public void toCheckGetWalletSuccess() { ResponseEntity<Statement>
	 * entity = restTemplate.getForEntity("/transactions", Statement.class);
	 * assertEquals(entity.getStatusCode(), HttpStatus.OK); }
	 * 
	 * @Test public void toCheckGetWalletFail() { ResponseEntity<Statement> entity =
	 * restTemplate.getForEntity("/transactions", Statement.class);
	 * assertEquals(entity.getStatusCode(), HttpStatus.NOT_FOUND); }
	 * 
	 * @Test public void toCheckGetByWalletIdSuccess() { ResponseEntity<Statement>
	 * entity = restTemplate.getForEntity("/transactions/1", Statement.class);
	 * assertEquals(entity.getStatusCode(), HttpStatus.OK); }
	 * 
	 * @Test public void toCheckGetByWalletIdFailure() { ResponseEntity<Statement>
	 * entity = restTemplate.getForEntity("/transactions/10", Statement.class);
	 * assertEquals(entity.getStatusCode(), HttpStatus.INTERNAL_SERVER_ERROR); }
	 * 
	 * @Test public void toCheckAddWalletSuccess() { Wallet wallet = new Wallet(1,
	 * 100.0); ResponseEntity<Statement> entity =
	 * restTemplate.postForEntity("/transactions", wallet, Statement.class);
	 * assertEquals(entity.getStatusCode(), HttpStatus.OK); }
	 * 
	 * @Test public void toCheckAddWalletFailure() { Wallet wallet = new Wallet(1,
	 * 100.0); ResponseEntity<Statement> entity =
	 * restTemplate.postForEntity("/transactions", wallet, Statement.class);
	 * assertEquals(entity.getStatusCode(), HttpStatus.NOT_FOUND); }
	 * 
	 * @Test public void toCheckAddMoneySuccess() {
	 * restTemplate.put("/wallets/1?currentBalance=" + 100, null);
	 * ResponseEntity<Wallet> entity = restTemplate.getForEntity("/transactions/1",
	 * Wallet.class); assertEquals(entity.getBody().getCurrentBalance(), 500, 0); }
	 * 
	 * @Test public void toCheckAddMoneyFailure() {
	 * restTemplate.put("/wallets/1?currentBalance=" + 0, null);
	 * ResponseEntity<Wallet> entity = restTemplate.getForEntity("/transactions/1",
	 * Wallet.class); assertNotEquals(entity.getBody(), 300.00);
	 * (entity.getBody().getCurrentBalance(), 300, 0) ; }
	 * 
	 * @Test public void toCheckPayMoneySuccess() {
	 * restTemplate.put("/wallets/1/pay?currentBalance=" + 100.0, null);
	 * ResponseEntity<Wallet> entity = restTemplate.getForEntity("/transactions/1",
	 * Wallet.class); assertEquals(entity.getBody().getCurrentBalance(), 300.0, 0);
	 * }
	 * 
	 * @Test public void toCheckGetStatementsSuccess() { ResponseEntity<Statement>
	 * entity = restTemplate.getForEntity("/transactions/statement",
	 * Statement.class); assertEquals(entity.getStatusCode(), HttpStatus.OK); }
	 * 
	 * @Test public void toCheckGetStatementsFailure() { ResponseEntity<Statement>
	 * entity = restTemplate.getForEntity("/transactions/statement",
	 * Statement.class); assertEquals(entity.getStatusCode(),
	 * HttpStatus.BAD_REQUEST); }
	 * 
	 * @Test public void toCheckGetStatementsByIdSuccess() {
	 * ResponseEntity<Statement> entity =
	 * restTemplate.getForEntity("/transactions/statements/1", Statement.class);
	 * assertEquals(entity.getStatusCode(), HttpStatus.OK); }
	 */

	/*
	 * @Autowired private TestRestTemplate restTemplate;
	 * 
	 * 
	 * 
	 * @Test public void testForNoAPI() throws Exception { ResponseEntity<Statement>
	 * response = restTemplate.getForEntity("/transactions", Statement.class);
	 * System.out.println(response.getStatusCodeValue());
	 * assertEquals(HttpStatus.NOT_FOUND,response.getStatusCode()); }
	 * 
	 * @Test public void testForCorrectAPI() throws Exception { ResponseEntity<List>
	 * response = restTemplate.getForEntity("/transactions", List.class);
	 * System.out.println(response.getStatusCodeValue());
	 * assertEquals(HttpStatus.OK,response.getStatusCode()); }
	 * 
	 * 
	 * @Test public void testForNoMethod() { ResponseEntity<Statement> response =
	 * restTemplate.getForEntity("/transactions", Statement.class);
	 * System.out.println(response.getStatusCodeValue());
	 * assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode()); }
	 */

	/*
	 * @Test public void testForGetAllTransaction() throws Exception {
	 * ResponseEntity<List> response = restTemplate.getForEntity("/statement");
	 * System.out.println(response.getStatusCodeValue()); assertEquals(
	 * HttpStatus.OK,response.getStatusCode()); }
	 * 
	 * @Test public void testForGetTransactionByID() throws Exception {
	 * ResponseEntity<Statement> response = restTemplate.getTransactionById(102);
	 * System.out.println(response.getStatusCodeValue());
	 * assertEquals(HttpStatus.OK,response.getStatusCode()); }
	 * 
	 * @Test public void testGetTransactionIdThatDoesNotExist() throws Exception {
	 * ResponseEntity<Statement> response = restTemplate.getTransactionById(1015);
	 * System.out.println(response.getStatusCodeValue());
	 * assertEquals(HttpStatus.NOT_FOUND,response.getStatusCode()); }
	 */
