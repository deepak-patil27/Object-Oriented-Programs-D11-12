package com.bridgelab.Stocks;

import java.util.Scanner;

public class StockMain {
	 public static void main(String[] args) {
	        StockPortfolio scanner = new StockPortfolio();
	        Account account = new Account();
	        Scanner sc = new Scanner(System.in);

	        boolean exit = true;
	        while(exit) {
	            System.out.println("Enter \n1)To add stock\n2)to display stock\n3)debit from account\n4)exit");
	            int option = sc.nextInt();
	            switch (option) {
	                case 1:
	                    scanner.stockPortfolio();
	                    break;
	                case 2:
	                    scanner.display();
	                    break;
	                case 3:
	                    account.debit(scanner.totalValue);
	                    break;
	                case 4:
	                    exit = false;
	                    break;
	                default:
	                    break;
	            }
	        }
	    }

}
