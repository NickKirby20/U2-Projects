import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RPGCharacterGUI {
    JFrame frame;
    static JLabel RPGCharacter;
    static  JTextField textInputField;



    public RPGCharacterGUI() {

        frame = new JFrame("Rpg Character statists");
        JPanel panel = new JPanel();
        textInputField = new JTextField(10);
        JLabel textInputLabel = new JLabel("Statists");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //JPanel panel = new statusScreen();

        frame.add(panel);
        frame.setVisible(true);

        JButton button = new JButton("Click to show statists");


        panel.add(textInputLabel);
        panel.add(textInputField);
        panel.add(RPGCharacter);
        panel.add(button);
        frame.add(panel);

        frame.setVisible(true);


    }

    private class statusScreen extends JPanel{

        public statusScreen(){

            setBackground(Color.WHITE);




        }

    }
    private static class ButtonListener implements ActionListener {


        public void actionPerformed(ActionEvent actionEvent) {
            JOptionPane.showMessageDialog(null, "You got a $1!");
        }


    }

}
