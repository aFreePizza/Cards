package cardpackage;

public class Deck {
    public Card[] deck = new Card[52];

    public Deck() {
        int counter = 0;
        String[] suits = {"hearts", "diamonds", "clubs", "spades"};
        for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 13; j++) {
                    deck[counter] = new Card(suits[i], j+1);
                    counter++;
                }
        }
    }
}