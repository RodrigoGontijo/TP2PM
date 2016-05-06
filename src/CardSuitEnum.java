
public enum CardSuitEnum {
    Hearts(1),
    Spades(2),
    Diamonds(3),
    Clubs(4);

    private final int value;

    CardSuitEnum(int cardSuiteValue){
        value = cardSuiteValue;
    }
    public int getCardSuitValue(){
        return value;
    }


}
