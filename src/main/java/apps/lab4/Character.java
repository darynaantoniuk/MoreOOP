package apps.lab4;
import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;



    public boolean isAlive() {
        return hp > 0;
    }

    public abstract void kick(Character enemy);

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }
}