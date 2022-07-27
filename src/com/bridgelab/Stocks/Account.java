package com.bridgelab.Stocks;

import java.util.Scanner;

public class Account {
	int debit;

    void debit(Double accountBalance){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to debit from account balance");
        debit = sc.nextInt();
        if (debit>accountBalance){
            System.out.println("Debit amount exceeded account balance");
            System.out.println("Account balance is: "+accountBalance);

        }
        else{
            accountBalance-=debit;
            System.out.println("Remaining account balance is: "+accountBalance);
        }
    }

    public Account() {
    }
	

}
