package Cards;

import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class Deck
{
    private static Deck INSTANCE;

    private static final ArrayList<Card> deck = new ArrayList<Card>();

    private Deck()
    {
        CardNamesAndValues dictionary = new CardNamesAndValues();
        HashMap<String, int[]> namesAndValues = dictionary.getCardsAndValues();

        for(SuitEnum suit : SuitEnum.values())
        {
            Iterator it = namesAndValues.entrySet().iterator();
            boolean multipleValue;
            int [] values;
            String name;
            Card card;

            while (it.hasNext())
            {
                Map.Entry pair = (Map.Entry)it.next();
                values = (int[])pair.getValue();
                name = pair.getKey().toString();

                if(values.length > 1){
                    multipleValue = true;
                }
                else{
                    multipleValue = false;
                }

                card = (Card) CardFactory.getCard(suit, multipleValue, pair.getKey().toString(), values);
                deck.add(card);
            }
        }
    }

    public static Deck getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Deck();
        }
        return INSTANCE;
    }

    public void ShuffleDeck(){
        Collections.shuffle(deck);
    }

    public Card popCard(){
        Card first = deck.get(0);
        deck.remove(0);
        return first;
    }

    public void insertCardsBack(ArrayList<Card> cards)
    {
        for(Card card : cards){
            deck.add(card);
        }
    }

}
