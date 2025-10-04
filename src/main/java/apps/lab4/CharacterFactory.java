package apps.lab4;

import java.util.Random;

public class CharacterFactory {
    private static final Random RANDOM = new Random();

    public static Character createCharacter() {
        int randomNumber = RANDOM.nextInt(4);

        switch (randomNumber) {
            case 0:
                return new Hobbit();
            case 1:
                return new King();
            case 2:
                return new Knight();
            case 4:
                return new Elf();
            default:
                throw new IllegalStateException("Unexpected value: " + randomNumber);
        }
    }
}
