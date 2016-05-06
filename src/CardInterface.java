/**
 * Created by rodri on 05/05/2016.
 */
public interface CardInterface {

    public CardSuitEnum getSuit();
    public String getName();
    public Boolean getMultipleValue();
    public int[] value();

}
