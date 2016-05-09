package Cards;

public class Card implements CardInterface
{
    private final SuitEnum cardSuitEnum;
    private final String name;
    private final Boolean multipleValue;
    private final int value [];

    Card(SuitEnum cardSuitEnum, Boolean multipleValue, String name, int[] value){
        this.cardSuitEnum = cardSuitEnum;
        this.name = name;
        this.multipleValue = multipleValue;
        this.value = value;
    }

    @Override
    public SuitEnum getSuit() {
        return this.cardSuitEnum;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Boolean hasMultipleValue() {
        return this.multipleValue;
    }

    @Override
    public int[] value() {
        return this.value;
    }

}
