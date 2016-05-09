package Cards;

public interface CardInterface {

    public SuitEnum getSuit();
    public String getName();
    public Boolean hasMultipleValue();
    public int[] value();

}
