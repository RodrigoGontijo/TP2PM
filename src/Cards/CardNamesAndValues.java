package Cards;

import java.util.HashMap;

public class CardNamesAndValues
{
    private HashMap<String, int[]> hmap;

    public CardNamesAndValues()
    {
        hmap = new HashMap<String, int[]>();
        hmap.put("Ás", new int[]{11, 1});
        hmap.put("Dois", new int[]{2});
        hmap.put("Tres", new int[]{3});
        hmap.put("Quatro", new int[]{4});
        hmap.put("Cinco", new int[]{5});
        hmap.put("Seis", new int[]{6});
        hmap.put("Sete", new int[]{7});
        hmap.put("Oito", new int[]{8});
        hmap.put("Nove", new int[]{9});
        hmap.put("Dez", new int[]{10});
        hmap.put("Valete", new int[]{10});
        hmap.put("Dama", new int[]{10});
        hmap.put("Rei", new int[]{10});
    }

    public HashMap<String, int[]> getCardsAndValues(){
       return hmap;
    }
}
