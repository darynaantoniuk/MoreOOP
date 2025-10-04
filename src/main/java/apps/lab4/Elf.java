package apps.lab4;

public class Elf extends Character {

    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character enemy) {
        if (enemy.getPower() < this.getPower()) {
            enemy.setHp(0);
        } else {
            this.setHp(this.getHp()-1);
        }
    }

    @Override
    public String toString() {
        return "Elf{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
