import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
   
        String mageName = JOptionPane.showInputDialog("Enter Mage's name:");
        String warriorName = JOptionPane.showInputDialog("Enter Warrior's name:");

        GameCharacter mage = new Mage(mageName);
        GameCharacter warrior = new Warrior(warriorName);

        BattleSystem battle = new BattleSystem(mage, warrior);
        battle.startBattle();
    }
}