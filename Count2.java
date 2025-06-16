import javax.swing.*;
import java.awt.event.*;
public class Count2 {
    public static void main(String[] args) {
        final int[] sum={0};
        JFrame jframe= new JFrame("Sum");
        jframe.setSize(300,200);
        jframe.setLayout(null);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label=new JLabel("Count Start");
        label.setBounds(200,100,50,30);
        jframe.add(label);
        JButton button = new JButton("Click");
        button.setBounds(200,130,80,30);
        jframe.add(button);
        button.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        sum[0]++;
                        label.setText(Integer.toString(sum[0]));
                    }
                }
        );

        jframe.setVisible(true);

    }
}
