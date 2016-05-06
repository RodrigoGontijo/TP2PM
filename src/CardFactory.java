

public class CardFactory {
    public static Card getCard(CardSuitEnum cardSuitEnum, Boolean multipleValue, String name, int[] value){
        Card card = new Card(cardSuitEnum,multipleValue,name,value);
        return card;
    }
}
