package medevil.ai.client;

import medevil.ai.server.Card;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.List;

import static medevil.ai.client.GuiParams.*;

public class CardView {

    private Card card;

    public CardView(Card card) {
        this.card = card;
    }


    public void render(Graphics2D g,int layoutX,int layoutY) {
        int x = layoutX;
        int y = layoutY;
//        int startX = WIDTH / 11;
//        int startY = HEIGHT / 3;
//
//        Font font = g.getFont();
//        Font biggerFont = font.deriveFont(font.getSize() * 1.8f);
//        g.setFont(biggerFont);

        g.drawRect(x, y, CARD_WIDTH, CARD_HEIGHT);
//        String text = card.getResourceName();
//        Rectangle2D stringBounds = g.getFontMetrics().getStringBounds(text, g);
//        int stringX = startX + (CARD_WIDTH / 2) - (int) (stringBounds.getWidth() / 2);
//        int stringY = startY + (CARD_HEIGHT / 2) + (int) (stringBounds.getHeight() / 2);
//        g.drawString(text, stringX, stringY);
//        startX += (int) (CARD_WIDTH * 1.5);
    }
}
