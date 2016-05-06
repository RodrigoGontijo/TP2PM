public class Card implements CardInterface{

    private final CardSuitEnum cardSuitEnum;
    private final String name;
    private final Boolean multipleValue;
    private final int value [];


    Card(CardSuitEnum cardSuitEnum, Boolean multipleValue, String name, int[] value){
        this.cardSuitEnum = cardSuitEnum;
        this.name = name;
        this.multipleValue = multipleValue;
        this.value = value;
    }

    @Override
    public CardSuitEnum getSuit() {
        return this.cardSuitEnum;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Boolean getMultipleValue() {
        return this.multipleValue;
    }

    @Override
    public int[] value() {
        return this.value;
    }

}
