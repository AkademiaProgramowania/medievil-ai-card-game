package medevil.ai.client;

import medevil.ai.server.Card;
import medevil.ai.server.Player;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.util.List;

import static medevil.ai.client.GuiParams.*;

public class GameView implements MouseListener {
    private final Player player;

    public GameView(Player player) {
        this.player = player;
    }

    public void tick() {

    }

    public void render(Graphics2D g) {
        List<Card> hand = player.getHand();
        int startX = WIDTH / 11;
        int startY = HEIGHT / 3;

        Font font = g.getFont();
        Font biggerFont = font.deriveFont(font.getSize() * 1.8f);
        g.setFont(biggerFont);

        for (int i = 0; i < hand.size(); i++) {
            g.drawRect(startX, startY, CARD_WIDTH, CARD_HEIGHT);
            String text = hand.get(i).getResourceName();
            Rectangle2D stringBounds = g.getFontMetrics().getStringBounds(text, g);
            int stringX = startX + (CARD_WIDTH / 2) - (int) (stringBounds.getWidth() / 2);
            int stringY = startY + (CARD_HEIGHT / 2) + (int) (stringBounds.getHeight() / 2);
            g.drawString(text, stringX, stringY);
            startX += (int) (CARD_WIDTH * 1.5);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("MouseReleased");
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
