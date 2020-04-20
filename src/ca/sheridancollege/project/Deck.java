package ca.sheridancollege.project;

public class Deck extends Card {
public enum Suit {HEARTS,DIAMONDS,SPADES,CLUBS};
    public enum Value {TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING,ACE};
    String card=new String();
    
    
    private final Suit color;
        private final Value value;
        
        public Deck(Suit s, Value gVal)
        {
           color =s;
           value= gVal;
        }
	public Value getValue() {
		return this.value;
	}
	public Suit getSuit() {
		return this.color;
        }
        public int getCardValue()
        {
            int cardValue=0;
            if(value==Value.TWO)
                cardValue=2;
            else if(value == Value.THREE)
                cardValue=3;
            else if(value == Value.FOUR)
                cardValue=4;
            else if(value == Value.FIVE)
                cardValue=5;
            else if(value == Value.SIX)
                cardValue=6;
            else if(value == Value.SEVEN)
                cardValue=7;
            else if(value == Value.EIGHT)
                cardValue=8;
            else if(value == Value.NINE)
                cardValue=9;
            else if(value == Value.TEN)
                cardValue=10;
            else if(value == Value.JACK)
                cardValue=11;
            else if(value  == Value.QUEEN)
                cardValue=12;
            else if(value == Value.KING)
                cardValue=13;
            else if(value == Value.ACE)
                cardValue=14;
            return cardValue;
        }
        @Override
    public String toString() {
        card=" "+getValue()+" "+getSuit();
        return card;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}