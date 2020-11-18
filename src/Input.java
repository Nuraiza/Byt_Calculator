import javax.swing.*;
import java.awt.event.*;


public class Input extends JFrame {

    public static void main(String [] args)
    {
        new Input();
    }
    private JButton buttonOK;
    private JTextField input;
    public Input()
    {
        this.setSize(550,150);
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        ButtonListener bl = new ButtonListener();

        JPanel panel1 = new JPanel();

        panel1.add(new JLabel("Enter an expression with spaces between, only -+*/ operations are available: "));
        input = new JTextField(15);
        panel1.add(input);

        buttonOK = new JButton("OK");
        buttonOK.addActionListener(bl);
        panel1.add(buttonOK);

        this.add(panel1);

        this.setVisible(true);
    }

    private class ButtonListener implements
            ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == buttonOK)
            {
                String expression = input.getText();

                if (expression.length() == 0)
                {
                    JOptionPane.showMessageDialog(
                            Input.this,
                            "You did not enter anything, please try again... ",
                            "Ooups",
                            JOptionPane.INFORMATION_MESSAGE);
                }
 else
                {
                    Chain chain = new Chain();
                    Request req = new Request(expression);
                    chain.process(req);

                    JOptionPane.showMessageDialog(
                            Input.this,
                            "The result is  "+ req.getResult(),
                            "Result",
                            JOptionPane.INFORMATION_MESSAGE);
                }

            }
        }
    }

}
