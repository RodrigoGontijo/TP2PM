import java.util.ArrayList;

public class User {

    private ArrayList<Card> cards;
    private int handValue;
    private String name;

    public User(String name){
        cards = new ArrayList<>();
        handValue = 0;
        this.name = name;
    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
