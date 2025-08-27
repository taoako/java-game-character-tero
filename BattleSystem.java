
import javax.swing.JOptionPane;

class BattleSystem {
    final private GameCharacter character1;
    final private GameCharacter character2;

    public BattleSystem(GameCharacter c1, GameCharacter c2) {
        this.character1 = c1;
        this.character2 = c2;
    }

    public void startBattle() {
        JOptionPane.showMessageDialog(null, "⚔ Battle Start! Both fighters have 100 HP.");

        GameCharacter current = character1;
        GameCharacter opponent = character2;

        while (character1.isAlive() && character2.isAlive()) {
          
            String[] options = {"Attack", "Special Move"};
            int choice = JOptionPane.showOptionDialog(
                null,
                current.name + "'s turn! Choose your move:",
                "Turn",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
            );

            if (choice == 0) {
                current.attack(opponent);
            } else {
                current.specialMove(opponent);
            }

      
            JOptionPane.showMessageDialog(null,
                "HP Status:\n" +
                character1.name + ": " + character1.hp + " HP\n" +
                character2.name + ": " + character2.hp + " HP"
            );

    
            if (!opponent.isAlive()) {
                JOptionPane.showMessageDialog(null, "Yey " + current.name + " wins the battle!");
                break;
            }

     
            GameCharacter temp = current;
            current = opponent;
            opponent = temp;
        }
    }
}
