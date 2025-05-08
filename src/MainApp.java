
import java.util.ArrayList;

class Participant{
    Hand hand;
    String name;
    Participant(String name){
        this.name=name;
    }
    public void pickUp(Hand hand){
        this.hand = hand;
        this.hand.show();
    }
}
public class MainApp {
    public static void main(String[] args) {
        Deck deck = new Deck();
        //random - stochastic stats - gaussian visual - brownian moving
        deck.shuffle();

        ArrayList<Participant> people = new ArrayList<>();

        people.add(new Participant("Dealer"));
        people.add(new Participant("Guest 1"));
        people.add(new Participant("Guest 2"));

        for(Participant p : people){
            p.pickUp(deck.dealHand());
        }

        for(Participant p : people){
            System.out.println(p.name + " - " + p.hand.toString());
        }

        Participant best = people.getFirst();

        for(Participant p: people){
            if(p.hand.getValue() > best.hand.getValue()){
                best = p;
            }
        }

        System.out.println("WINNER: " + best.name);
    }
}
