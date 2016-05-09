package Users;

import Cards.Card;

import java.util.ArrayList;

public class User
{
    private ArrayList<Card> cards;
    private String name;

    public User(String name){
        cards = new ArrayList<Card>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public ArrayList<Card> removeCards() {

        ArrayList<Card> aux = new ArrayList<Card> ();
        for(Card card : this.cards){
            aux.add(card);
        }
        this.cards.removeAll(this.cards);

        return aux;
    }

    public int getHandValue() {
        int handValue = 0;
        ArrayList<Card> multipleValues = new ArrayList<Card>();
        for(Card card : this.cards)
        {
            if(card.hasMultipleValue()){
                multipleValues.add(card);
            }
            handValue += card.value()[0];
        }

        for(Card card : multipleValues){
            if(handValue > 21){
                handValue -= card.value()[0];
                handValue += card.value()[1];
            }
        }

        return handValue;

    }


    public void addCard(Card card) {
        // Simula um usuario comprando cartas, e deve ser usada em conjunto com a funçao Deck.POPcard()
        this.cards.add(card);
    }


}
