package com.bridgelab.Deck;


public class Deck {
	public static void main(String[] args) {
		String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] rank = {"2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"};
		String[][] cardsArray = new String[4][13];

		int n = suit.length * rank.length;
		String[] deck = new String[n];
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < suit.length; j++) {
				deck[suit.length*i + j] = rank[i] + " of " + suit[j];
			}
		}


		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n-i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}

		for (int i = 0; i < 4; i++) {
			System.out.println("\n  Cards received by the Player -> " + (i + 1));
			for (int j = 0; j < 9; j++) {
				System.out.println(deck[i + j * 4] + " (Card " + (i + j * 4) + ")");
			}
		}
	}
}
