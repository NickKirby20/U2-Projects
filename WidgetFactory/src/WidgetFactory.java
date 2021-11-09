import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WidgetFactory {

    /*
    Lessons L1 - L3

    You have been asked by the manager of the Widget Factory to create a program which will tell how many days it will take to produce a number of widgets.
    It should also output the cost of the widgets, the cost to produce the widget and the profit.

    Specific Details:
     - 10 Widgets are made each hour
     - Plant runs 2 shifts of 8 hours a day, requiring 5 workers a shift
     - each worker makes $16.50 an hour
     - each widget sells for $10

     Programming Details:
     - prompt the user for the number of widgets using pop-up boxes
     - display # of widgets, # of days, Cost of production, Cost of widgets and profit
     - 2 or more (preferably more) methods - at least 1 to calculate # of day and one to calculate production costs
     - only WHOLE number of days, no half or partial days.
     - Output should be in proper currency form

     Example Run:

     Number of Widgets: 1000
     # of Days: 7
     Cost of Widgets: $10,000.00
     Cost of Production: $9,240.00
     Profit: $760.00

     */

    static int WidgetFactory = 0;
    static JTextField textInputField;


    public static void main(String[] args) {




        JFrame window = new JFrame("Widget Factory");
        JPanel panel = new JPanel();
       textInputField = new JTextField(10);
        //JLabel textInputLabel = new JLabel("Number of widgets: ");
        JLabel widgetLabel = new JLabel("Number of widgets: ");

        JLabel textInputLabel2 = new JLabel("Amount of days: ");
        textInputField = new JTextField(10);

        //JButton priceOfWidget = new JButton();

        window.setSize(350, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        //priceOfWidget.addActionListener(new ButtonListener());


        //panel.add(priceOfWidget);
        panel.add(textInputLabel2);
        panel.add(textInputField);
        panel.add(widgetLabel);
        panel.add(textInputField);
        //panel.add();
        window.add(panel);
        window.setVisible(true);


    }

    private static class ButtonListener implements ActionListener{


        public void actionPerformed(ActionEvent actionEvent) {

            int multiplier =Integer.parseInt(textInputField.getText());

            WidgetFactory += multiplier;
            textInputField.setText("Balance:  $" + WidgetFactory);



        }
    }

}
