

public class CardFactory {
    public static CardInterface getCard(CardSuitEnum cardSuitEnum, Boolean multipleValue, String name, int[] value){
        Card card = new Card(cardSuitEnum,multipleValue,name,value);
        return card;
    }
}
