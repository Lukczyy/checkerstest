import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame test = new Frame();
        test.setVisible(true);
    }
}

class Frame extends JFrame {
    public Frame() {
        super("Checkers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(getToolkit().getScreenSize().width, getToolkit().getScreenSize().height);
        setLayout(new GridBagLayout());

        String[] amount = {"2", "3", "4", "6"};
        JComboBox amountOfPlayers = new JComboBox(amount);

        add(new JLabel("Wybierz liczbe graczy: "));
        add(amountOfPlayers);
    }
}