package medevil.ai;

public class Main {
    public static void main(String[] args) {
        Display display = new Display("Medievil AI");
        GameView gameView = new GameView();
        GameEngine engine = new GameEngine(display, gameView);
        
        display.addListener(gameView);
        engine.start();
    }
}