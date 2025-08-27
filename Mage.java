
import javax.swing.JOptionPane;

class Mage extends GameCharacter {
    public Mage(String name) {
        super(name, 100, 20, 30); // hp, attackDamage, specialDamage
    }

    @Override
    public void attack(GameCharacter opponent) {
        opponent.hp -= attackDamage;
        JOptionPane.showMessageDialog(null, name + " casts Fireball! (" + attackDamage + " damage)");
    }

    @Override
    public void specialMove(GameCharacter opponent) {
        opponent.hp -= specialDamage;
        JOptionPane.showMessageDialog(null, name + " uses Lightning Storm! (" + specialDamage + " damage)");
    }
}