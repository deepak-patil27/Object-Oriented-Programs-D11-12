package com.bridgelab.Stocks;

public class AccountMain {
	public static void main(String[] args) {
        Account account = new Account();
        StockPortfolio stockPortfolio = new StockPortfolio();
        account.debit(stockPortfolio.totalValue);
    }

}
