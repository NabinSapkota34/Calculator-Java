import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI implements ActionListener {
    JFrame frame = new JFrame();

    JButton add = new JButton("Add");
    JButton subtract = new JButton("Subtract");
    JButton multiply = new JButton("Multiply");
    JButton divide = new JButton("Divide");
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();

    void renderform(){
        t1.setBounds(10,10,200,50);
        t2.setBounds(10,50,200,50);
        t3.setBounds(10,100,200,50);

        frame.add(t1);
        frame.add(t2);
        frame.add(t3);

        add.setBounds(10,150,100,30);
        subtract.setBounds(120,150,100,30);
        multiply.setBounds(230,150,100,30);
        divide.setBounds(340,150,100,30);

        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);

        add.setFocusable(false);
        subtract.setFocusable(false);
        multiply.setFocusable(false);
        divide.setFocusable(false);

        frame.add(add);
        frame.add(subtract);
        frame.add(multiply);
        frame.add(divide);
    }

    void render(){
        renderform();
        frame.setSize(500,250);
        frame.setLayout(null);
        frame.setTitle("Calculator");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int sum = num1 + num2;
            t3.setText(String.valueOf(sum));
        } else if (e.getSource() == subtract) {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int difference = num1 - num2;
            t3.setText(String.valueOf(difference));
        } else if (e.getSource() == multiply) {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int product = num1 * num2;
            t3.setText(String.valueOf(product));
        } else if (e.getSource() == divide) {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            if (num2 == 0) {
                t3.setText("Cannot divide by zero");
            } else {
                double quotient = (double) num1 / num2;
                t3.setText(String.valueOf(quotient));
            }
        }
    }
}
