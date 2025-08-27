
import javax.swing.JOptionPane;

abstract class GameCharacter {
    String name;
    int hp;
    int attackDamage;
    int specialDamage;

    public GameCharacter(String name, int hp, int attackDamage, int specialDamage) {
        this.name = name;
        this.hp = hp;
        this.attackDamage = attackDamage;
        this.specialDamage = specialDamage;
    }

   
    public abstract void attack(GameCharacter opponent);
    public abstract void specialMove(GameCharacter opponent);

    public boolean isAlive() {
        return hp > 0;
    }

    public void showStatus() {
        JOptionPane.showMessageDialog(null, name + " has " + hp + " HP left.");
    }
}