
import java.util.ArrayList;
import java.util.Collections;

public class Deck { //acting like a Game class
    private ArrayList<Card> cards;

    Deck() {
        this.cards = new ArrayList<>();
        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
        String[] values = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        //create all cards
        for(String s : suits){ //four kinds
            for(String v : values){
                this.cards.add(new Card(s,v));
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(this.cards);
    }
    public Card dealCard(){
        //deal off the top
//        return cards.isEmpty() ? null : cards.remove(0);
        if(cards.size() > 0){
            return cards.remove(0);
        } else {
            return null;
        }
    }
    public int getSize(){
        return this.cards.size();
    }
}
