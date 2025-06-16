import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JframeDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("First");
        frame.setSize(300, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Important!

        JButton button = new JButton("Click");
        JLabel label = new JLabel("Count");
        JTextField textField = new JTextField();

        // Set positions and sizes
        button.setBounds(100, 200, 70, 30);
        label.setBounds(100, 150, 100, 30);
        textField.setBounds(100, 100, 100, 30); // Proper location and size

        // Add components to frame
        frame.add(button);
        frame.add(label);
        frame.add(textField);

        // Absolute layout
        frame.setLayout(null);

        // Action listener
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                label.setText(text);
            }
        });

        frame.setVisible(true);
    }
}
