package medevil.ai.server;

import java.util.LinkedList;
import java.util.List;

public class Player {
    private List<Card> hand;

    public static int STARTING_CARDS_NUMBER = 3;
    //^ przemiescic w lepsze miejsce
    public Player() {
        hand = generate3CardHand();
    }

    private List<Card> generate3CardHand() {
        List<Card> hand = new LinkedList<>();
        for (int i = 0; i < STARTING_CARDS_NUMBER; i++) {
            hand.add(new Card());
        }
        return hand;
    }

    public List<Card> getHand() {
        return hand;
    }
}
