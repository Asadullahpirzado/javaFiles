import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Counter Example");
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("0");
        label.setBounds(130, 50, 50, 30);
        frame.add(label);

        JButton button = new JButton("Click Me");
        button.setBounds(100, 100, 100, 30);
        frame.add(button);

        // Declare counter variable as array to use inside inner class
        final int[] count = {0}; // starts from 0, will show 1 on first click

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count[0]++; // Increase by 1
                label.setText(Integer.toString(count[0])); // Update label
            }
        });

        frame.setVisible(true);
    }
}
