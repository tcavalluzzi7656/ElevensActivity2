/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {"ace", "5", "8"};
        String[] suits = {"diamonds", "spades", "clubs"};
        int[] pointValues = {1, 5, 8};
        Deck d = new Deck(ranks, suits, pointValues);
        System.out.println(d.deal());
        System.out.println(d.deal());
        System.out.println(d.deal());
        System.out.println(d.deal());
        System.out.println(d.deal());
        System.out.println(d.deal());
        System.out.println(d.deal());
        System.out.println(d.deal());
        System.out.println(d.deal());
        System.out.println(d.deal());
        System.out.println(d.deal());
        System.out.println(d.deal());
        System.out.println(d.deal());

    }
}

