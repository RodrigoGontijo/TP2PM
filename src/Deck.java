import java.util.ArrayList;

public class Deck {

    ArrayList<Card> deck = new ArrayList<Card>();

    public Deck() {
        CardDictionary dictionary = new CardDictionary();
        String name = "";
        Boolean multipleValue = false;
        int[] value = {};
        String suit = "";

        for (int i = 1; i <= 4; i++) {
            suit = getSuit(i);
            for (int j = 1; j <= 13; j++) {
                name = getName(j);
                value = dictionary.getKey(name);
                multipleValue = j == 1;
            }
            Card card = (Card) CardFactory.getCard(CardSuitEnum.valueOf(suit), multipleValue, name, value);
            deck.add(card);
        }

    }

    private String getSuit(int i) {
        String suit = "";
        if (i == CardSuitEnum.Clubs.getCardSuitValue()) {
            suit = CardSuitEnum.Clubs.name();
        }

        if (i == CardSuitEnum.Hearts.getCardSuitValue()) {
            suit = CardSuitEnum.Hearts.name();

        }

        if (i == CardSuitEnum.Spades.getCardSuitValue()) {
            suit = CardSuitEnum.Spades.name();

        }

        if (i == CardSuitEnum.Diamonds.getCardSuitValue()) {
            suit = CardSuitEnum.Diamonds.name();
        }
        return suit;
    }


    private String getName(int i) {
        String name = "";
        switch (i) {
            case 1:

                name = "Ace";
                break;

            case 2:

                name = "Douce";
                break;

            case 3:

                name = "Three";
                break;

            case 4:

                name = "Four";
                break;

            case 5:

                name = "Five";
                break;

            case 6:

                name = "Six";
                break;

            case 7:

                name = "Seven";
                break;

            case 8:
                name = "Eight";
                break;

            case 9:

                name = "Nine";
                break;

            case 10:

                name = "Ten";
                break;

            case 11:

                name = "Jack";
                break;

            case 12:

                name = "Queen";
                break;

            case 13:

                name = "King";
                break;
        }
        return name;

    }
}
