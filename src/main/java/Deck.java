import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public int countCards() {
        return this.cards.size();
    }

    public void populateDeck() {

        for (SuitType suit : SuitType.values()) {

            for (RankType rank : RankType.values()) {

                Card card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
    }
}
