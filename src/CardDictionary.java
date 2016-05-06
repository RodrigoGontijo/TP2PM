import java.util.HashMap;

public class CardDictionary {

    private HashMap<String, int[]> hmap;


    public CardDictionary(){
        hmap = new HashMap<String, int[]>();
        hmap.put("Ace", new int[]{1, 11});
        hmap.put("Douce", new int[]{2});
        hmap.put("Three", new int[]{3});
        hmap.put("Four", new int[]{4});
        hmap.put("Five", new int[]{5});
        hmap.put("Six", new int[]{6});
        hmap.put("Seven", new int[]{7});
        hmap.put("Eight", new int[]{8});
        hmap.put("Nine", new int[]{9});
        hmap.put("Ten", new int[]{10});
        hmap.put("Jack", new int[]{11});
        hmap.put("Queen", new int[]{12});
        hmap.put("King", new int[]{13});

    }


    public int[] getKey(String key){
       return hmap.get(key);
    }
}
