/**
 * This is a class that tests the Card class.
 */
public class CardTester {


	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("Ace", "Spades", 1);
		Card card2 = new Card("Ace", "Spades", 1);
		Card card3 = new Card("2", "Clubs", 2);

		if (card1.matches(card2)) {
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}
		System.out.println("Expected: Good");

		if (card1.matches(card3)) {
			System.out.println("Good");
			} else {
			System.out.println("Bad");
		}
		System.out.println("Expected: Bad");


		// card1.suit("Spades");

		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	}
}
