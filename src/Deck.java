
import java.util.ArrayList;
import java.util.Collections;

public class Deck { //acting like a Game class
    private ArrayList<Card> cards;
    int INITIAL_CARDS_PER_HAND = 2;
    Deck() {
        this.cards = new ArrayList<>();
        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        //create all cards
        for (String s : suits) { //four kinds
            for (int i = 0; i < values.length; i++) {

//                int n = i + 2;//current index + 2 because "2" is the zeroth
//                if ("JQK".contains(values[i])) {
//                    n = 10;
//                } else if ("A".contains(values[i])) {
//                    n = 11;
//                }

                int n =  switch (values[i]){
                    case "K", "J", "Q" -> 10;
                    case "A" -> 11;
                    default -> i + 2; //current index + 2 because "2" is the zeroth
                };
                this.cards.add(new Card(s, values[i], n));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public Card dealCard() {
        //deal off the top
//        return cards.isEmpty() ? null : cards.remove(0);
        if (cards.size() > 0) {
            return cards.remove(0);
        } else {
            return null;
        }
    }
    public Hand dealHand(){
        Hand hand = new Hand();
        for (int i = 0; i < INITIAL_CARDS_PER_HAND; i++) {
            hand.pickUp(dealCard());
        }
        return hand;
    }

    public int getSize() {
        return this.cards.size();
    }
}
