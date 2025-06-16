import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class UserRegistrationForm extends JFrame {
    private JTextField nameField, emailField;
    private JPasswordField passwordField;
    private JComboBox<String> userModeBox;
    private JButton registerButton;
    private JLabel statusLabel;

    public UserRegistrationForm() {
        setTitle("💸 Expense Tracker - Sign Up");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);


        // List<Color> colors = Arrays.asList(
        //       new Color(255, 255, 255),   // background
        //     new Color(0, 180, 216),     // accent
        //   new Color(34, 139, 34),     // success
        // new Color(220, 20, 60),     // error
        //new Color(50, 50, 50)       // text
        //);

        Color bgColor = new Color(255, 255, 255);            // White background
        Color accentColor = new Color(0, 180, 216);          // Blue accent
        Color successColor = new Color(34, 139, 34);         // Green
        Color errorColor = new Color(220, 20, 60);           // Red
        Color textColor = new Color(50, 50, 50);

        JPanel formPanel = new JPanel(new GridBagLayout());
        //GridBagLayout lets you place items (like labels and text fields)
        // in a grid, with full control over spacing and positioning.
        formPanel.setBackground(new Color(245, 251, 253)); //
        // Sets the background color of the panel to a
        // light bluish-white color (RGB: 245, 251, 253).
        formPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        GridBagConstraints gbc = new GridBagConstraints();
        //Creates a GridBagConstraints object, which tells the layout
        // how to position each component (label, text field, etc.) in the grid
        gbc.insets = new Insets(15, 10, 15, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel title = new JLabel("✨ Register to Expense Tracker");
        title.setFont(new Font("Poppins", Font.BOLD, 20));
        title.setForeground(accentColor);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(title, gbc);

        // Name field
        gbc.gridwidth = 1;
        gbc.gridy++;
        formPanel.add(label("Name:", textColor), gbc);
        gbc.gridx = 1;
        nameField = inputField();
        formPanel.add(nameField, gbc);

        // Email
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(label("Email:", textColor), gbc);
        gbc.gridx = 1;
        emailField = inputField();
        formPanel.add(emailField, gbc);

        // Password
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(label("Password:", textColor), gbc);
        gbc.gridx = 1;
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Poppins", Font.PLAIN, 14));
        formPanel.add(passwordField, gbc);

        // User mode
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(label("User Type:", textColor), gbc);
        gbc.gridx = 1;
        userModeBox = new JComboBox<>(new String[]{"Single", "Mom", "Dad"});
        userModeBox.setFont(new Font("Poppins", Font.PLAIN, 14));
        formPanel.add(userModeBox, gbc);

        // Register button
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        registerButton = new JButton("🚀 Create Account");
        registerButton.setBackground(accentColor);
        registerButton.setForeground(Color.WHITE);
        registerButton.setFont(new Font("Poppins", Font.BOLD, 16));
        registerButton.setFocusPainted(false);
        registerButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        formPanel.add(registerButton, gbc);

        // Status label
        gbc.gridy++;
        statusLabel = new JLabel("", SwingConstants.CENTER);
        statusLabel.setFont(new Font("Poppins", Font.PLAIN, 13));
        formPanel.add(statusLabel, gbc);

        getContentPane().setBackground(bgColor);
        add(formPanel);

        // Button logic
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registerUser(accentColor, successColor, errorColor);
            }
        });

        setVisible(true);
    }

    private JLabel label(String text, Color color) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Poppins", Font.PLAIN, 14));
        label.setForeground(color);
        return label;
    }

    private JTextField inputField() {
        JTextField field = new JTextField(15);
        field.setFont(new Font("Poppins", Font.PLAIN, 14));
        return field;
    }

    private void registerUser(Color accent, Color success, Color error) {
        String name = nameField.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        String userMode = (String) userModeBox.getSelectedItem();

        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            statusLabel.setForeground(error);
            statusLabel.setText("⚠ Please fill all fields.");
            return;
        }

        UserDAO userDAO = new UserDAO();
        try {
            if (userDAO.getUserByEmail(email) != null) {
                statusLabel.setForeground(error);
                statusLabel.setText("⚠ Email already registered.");
                return;
            }

            userDAO.createUser(name, email, password, userMode);
            statusLabel.setForeground(success);
            statusLabel.setText("✅ Account created successfully!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            statusLabel.setForeground(error);
            statusLabel.setText("❌ Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UserRegistrationForm());
    }
}
