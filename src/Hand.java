import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    Hand(){
        cards = new ArrayList<Card>();
    }
    public int getSize(){
        return this.cards.size();
    }
    public int getValue(){
        int total = 0;
        for(Card c : cards){
            c.flip(); //PEAK UNDER CARD
            total += c.getPointValue();
            c.flip(); //PUT IT BACK
        }
        return total;
    }
    public void pickUp(Card card){
        this.cards.add(card);
    }
}