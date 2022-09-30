import cardpackage.*;

public class StartingPoint {
    /**
     * @param args
     */
    public static void main (String[] args) {
        Card myCard = new Card("clubs", 7);
        myCard.PrintCard();

        Deck myDeck = new Deck();
        for (int i = 0; i < 52; i++ ) {
            myDeck.deck[i].PrintCard();
        }
    }
}