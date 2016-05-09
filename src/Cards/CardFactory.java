package Cards;

import Cards.Card;

public class CardFactory {

    public static CardInterface getCard(SuitEnum cardSuitEnum, Boolean multipleValue, String name, int[] value)
    {
        Card card = new Card(cardSuitEnum,multipleValue,name,value);
        return card;
    }
}
