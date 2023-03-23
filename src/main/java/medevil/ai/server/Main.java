package medevil.ai.server;

import medevil.ai.client.Display;
import medevil.ai.client.GameEngine;
import medevil.ai.client.GameView;

public class Main {
    public static void main(String[] args) {
        Display display = new Display("Medievil AI");

        Player player = new Player();
        GameView gameView = new GameView(player);
        GameEngine engine = new GameEngine(display, gameView);
        
        display.addListener(gameView);
        engine.start();
    }
}