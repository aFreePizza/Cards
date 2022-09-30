package cardpackage;

public class Card {
    String suit;
    int value;

    /**
     * @param s
     * @param v
     */
    public Card(String s, int v){
        suit = s;
        value = v;
    }
    public void PrintCard(){
            System.out.println(value + " of " + suit);
    }
}