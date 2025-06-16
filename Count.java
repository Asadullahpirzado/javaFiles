import javax.swing.*;
import java.awt.event.*;
public class Count {
    public static void main(String[] args) {
        final int[]  sum={0};
        JFrame frame = new JFrame("Number Sum");
        frame.setSize(300,200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Count");
        label.setBounds(100,100,50,30);
        frame.add(label);
        JButton button = new JButton("Click");
        button.setBounds(100,130,100,30);
        frame.add(button);
        button.addActionListener(new ActionListener() {
                                     @Override
                                     public void actionPerformed(ActionEvent e) {
                                         sum[0]++;
                                         label.setText(Integer.toString(sum[0]));
                                     }});
        frame.setVisible(true);
    }
}
