package apps.lab4;

public class Hobbit extends Character{

    public Hobbit() {
        super(3, 0);
    }

    @Override
    public void kick(Character enemy) {
        System.out.println("Cry a lot!");
    }

    @Override
    public String toString() {
        return "Hobbit{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
