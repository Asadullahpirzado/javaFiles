import javax.swing.*;
import java.awt.event.*;

 public class SimpleJFrameDemo extends JFrame {
    public SimpleJFrameDemo() {
        // Set up the window
        setTitle("Simple JFrame");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JTextField textField = new JTextField(10); // Text field
        JLabel label = new JLabel("Text will show here"); // Label
        JButton button = new JButton("Click Me"); // Button

        // Add components to the window
        add(textField);
        add(button);
        add(label);

        // Set layout
        setLayout(new java.awt.FlowLayout());

        // Add action listener to button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                label.setText(text);
            }
        });
    }

    public static void main(String[] args) {
        SimpleJFrameDemo frame = new SimpleJFrameDemo();
        frame.setVisible(true);
    }
}