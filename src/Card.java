
public class Card {
    //private variables
    private boolean isFaceUp;
    private String value; //2-10 J Q K A
    private String suit; //Hearts Clubs Spades Diamonds

    // constructors
    Card(String suit, String value){
        this.suit = suit;
        this.value = value;
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

        // determine point value and return it

        // A = 11
        if(this.value.equals("A")){
            return 11;
        }

        // K, Q, J = 10
        if(
                this.value.equals("K") ||
                        this.value.equals("Q") ||
                        this.value.equals("J")
        ){
            return 10;
        }

        // all numeric cards are equal to their face value
        return Integer.parseInt(this.value);
    }

    //methods
    void flip(){
        this.isFaceUp = !this.isFaceUp; //invert using not
    }

    public String toString(){
        return getValue() + getSuit();
    }

    public static void main(String[] args) {
        Card c = new Card("H", "A");
        System.out.println(c);
        c.flip();
        System.out.println(c);
    }
}
