package medevil.ai.client;

import medevil.ai.server.Card;
import medevil.ai.server.Player;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static medevil.ai.client.GuiParams.CARD_WIDTH;

public class PlayerView {
   private Player player;
    private List<CardView> cardViews = new ArrayList<>();
    private int x;
    private int y;

    public PlayerView(Player player,int x,int y) {
        this.player = player;
        this.x = x;
        this.y = y;

        List<Card> cards = player.getHand();
        for (Card card : cards) {
            CardView cardView = new CardView(card);
            cardViews.add(cardView);
        }
    }


    public void render(Graphics2D g) {
        int cardX = x;
        int cardY = y;

        for (int i = 0; i < cardViews.size(); i++) {
            CardView card = cardViews.get(i);
            card.render(g, cardX, cardY);
           cardX += (int) (CARD_WIDTH * 1.5);
        }
    }
}
