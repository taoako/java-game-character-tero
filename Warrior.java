
import javax.swing.JOptionPane;

class Warrior extends GameCharacter {
    public Warrior(String name) {
        super(name, 100, 15, 25); // hp, attackDamage, specialDamage
    }

    @Override
    public void attack(GameCharacter opponent) {
        opponent.hp -= attackDamage;
        JOptionPane.showMessageDialog(null, name + " swings a mighty sword! (" + attackDamage + " damage)");
    }

    @Override
    public void specialMove(GameCharacter opponent) {
        opponent.hp -= specialDamage;
        JOptionPane.showMessageDialog(null, name + " uses Shield Bash! (" + specialDamage + " damage)");
    }
}