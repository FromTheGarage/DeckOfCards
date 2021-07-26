package Arrays;

public class DeckOfCards {
	public static void main(String[] args) {
		//Create arrays to hold the deck, suits, and ranks
		int[] deck = new int[52]; 
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"}; 
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
	
		for(int i = 0; i < deck.length; i++) {	//Initialize cards
			deck[i] = i;
		}
		
		for(int i = 0; i < deck.length; i++) {	//shuffle the deck
			//Generate an index randomly
			int index = (int)(Math.random() * deck.length); 
			int temp = deck[i]; //temporary storage for this iteration
			
			/* The card at the current index (deck[i]) will be swapped with a card at the the index of the randomly 
			generated number (deck[index]) */
			deck[i] = deck[index]; 
			deck[index] = temp;
		}
		
		//Display the first four cards
		for(int i = 0; i < 4; i++) {
			String suit = suits[deck[i] / 13];	//Select the card's suit
			String rank = ranks[deck[i] % 13];	//Select the card's rank
			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);	

		}
	}

}
