package apps.lab4;
import java.util.Random;

public class Noble extends Character{
    private static Random RANDOM = new Random();


    public Noble(int minPower, int maxPower, int minHp, int maxHp) {
        super(
            RANDOM.nextInt(maxPower - minPower + 1) + minPower,
            RANDOM.nextInt(maxHp - minHp + 1) + minHp
        );
    }

    @Override
    public void kick(Character enemy) {
        enemy.setPower(RANDOM.nextInt(this.getHp()));
    }
}
