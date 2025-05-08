
import java.util.HashMap;

public class Card {
    //private variables
    private boolean isFaceUp;
    private String value; //2-10 J Q K A
    private int numericValue;
    private String suit; //Hearts Clubs Spades Diamonds

    // constructors
    Card(String suit, String value, int numericValue){
        this.suit = suit;
        this.value = value;
        this.numericValue = numericValue;
        this.isFaceUp = false;
    }

    //getters

    public String getSuit() {
        return isFaceUp ? suit : "#";
    }

    public String getValue() {
        return isFaceUp ? value : "#";
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public int getPointValue(){
        return this.numericValue;

        //MOVED THIS CHOICE TO THE DECKS CONSTRUCTOR

//        return switch (this.value){
//            case "K", "J", "Q" -> 10;
//            case "A" -> 11;
//            default -> Integer.parseInt(this.value);
//        };

        // determine point value and return it
//        HashMap<String,Integer> map = new HashMap<>();
//        map.put("A",11);
//        map.put("K",10);
//        map.put("Q",10);
//        map.put("J",10);
//        if(map.containsKey(this.value)){
//            return map.get(this.value);
//        }
//        return Integer.parseInt(this.value);// all numeric cards are equal to their face value

//        if(this.value.equals("A")){// A = 11
//            return 11;
//        } else if(this.value.equals("K") || this.value.equals("Q") || this.value.equals("J")){
//            // K, Q, J = 10
//            return 10;
//        }
//        return Integer.parseInt(this.value);// all numeric cards are equal to their face value

    }

    //methods
    void flip(){
        this.isFaceUp = !this.isFaceUp; //invert using not
    }

    public String toString(){
//        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
        String prefix =   switch (getSuit()){
            case "Hearts", "Diamonds" -> ColorCodes.RED;
            case "Spades", "Clubs" -> ColorCodes.BLACK;
            default -> ColorCodes.RESET;
        };
        return ColorCodes.WHITE_BACKGROUND + prefix + getValue() + " of " + getSuit() + ColorCodes.RESET;
    }

}
