package medevil.ai.server;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Card {
    private static final List<String> resources = new ArrayList<>(
            List.of("drewno",
                    "kamien",
                    "cegly"));
    private String resourceName;

    public Card() {
        resourceName = generateRandomCard();
    }

    public String generateRandomCard() {
        Random random = new Random();
        return resources.get(random.nextInt(resources.size()));
    }

    public String getResourceName() {
        return resourceName;
    }

    @Override
    public String toString() {
        return resourceName;
    }
}
