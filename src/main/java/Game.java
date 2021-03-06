import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;

    public Game() {
        this.players = new ArrayList<Player>();
        this.deck = new Deck();
    }

    public int countPlayers() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public Player calculateWinner() {
        int cardValue = 0;
        Player winner = null;

        for (Player player : this.players) {
            int currentValue = player.getCard().getRank().getValue();
            if (currentValue > cardValue) {
                cardValue = currentValue;
                winner = player;
            } else if (currentValue == cardValue) {
                calculateWinner();
            }
            return winner;
        }
    }


    public Player playGame() {
        this.deck.populateDeck();
        this.deck.shuffle();

        this.deck.dealCard(this.players);

        Player winner = calculateWinner();

        return winner;
    }
}
