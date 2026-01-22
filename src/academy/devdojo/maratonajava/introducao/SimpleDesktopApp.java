package academy.devdojo.maratonajava.introducao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A simple yet professional desktop application interface in Java using Swing.
 * This application demonstrates a clean UI with menu bar, toolbar, form input,
 * and event handling for user interactions.
 */
public class SimpleDesktopApp extends JFrame {

    private JTextField nameField;
    private JTextField emailField;
    private JLabel statusLabel;

    /**
     * Constructor to set up the GUI components and layout.
     */
    public SimpleDesktopApp() {
        setTitle("Professional Java Desktop App");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize components
        initializeMenuBar();
        initializeToolBar();
        initializeCentralPanel();
        initializeStatusBar();
        initializeEventHandlers();
    }

    /**
     * Initializes the menu bar with File and Help menus.
     */
    private void initializeMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        // File menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(newItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // Help menu
        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutItem = new JMenuItem("About");
        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);
    }

    /**
     * Initializes the toolbar with action buttons.
     */
    private void initializeToolBar() {
        JToolBar toolBar = new JToolBar();
        JButton newBtn = new JButton("New");
        JButton saveBtn = new JButton("Save");
        JButton exitBtn = new JButton("Exit");
        toolBar.add(newBtn);
        toolBar.add(saveBtn);
        toolBar.add(exitBtn);
        add(toolBar, BorderLayout.NORTH);
    }

    /**
     * Initializes the central panel with a form for data input.
     */
    private void initializeCentralPanel() {
        JPanel centerPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        // Name label and field
        gbc.gridx = 0;
        gbc.gridy = 0;
        centerPanel.add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        nameField = new JTextField(20);
        centerPanel.add(nameField, gbc);

        // Email label and field
        gbc.gridx = 0;
        gbc.gridy = 1;
        centerPanel.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        emailField = new JTextField(20);
        centerPanel.add(emailField, gbc);

        // Submit button
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton submitBtn = new JButton("Submit");
        centerPanel.add(submitBtn, gbc);

        add(centerPanel, BorderLayout.CENTER);
    }

    /**
     * Initializes the status bar at the bottom.
     */
    private void initializeStatusBar() {
        statusLabel = new JLabel("Ready");
        statusLabel.setBorder(BorderFactory.createLoweredBevelBorder());
        add(statusLabel, BorderLayout.SOUTH);
    }

    /**
     * Initializes event handlers for menu items, toolbar buttons, and form button.
     */
    private void initializeEventHandlers() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                switch (command) {
                    case "New":
                        nameField.setText("");
                        emailField.setText("");
                        statusLabel.setText("Form cleared");
                        break;
                    case "Save":
                        // Simulate save operation
                        statusLabel.setText("Data saved");
                        break;
                    case "Exit":
                        System.exit(0);
                        break;
                    case "About":
                        JOptionPane.showMessageDialog(SimpleDesktopApp.this, "Professional Java Desktop App v1.0\nBuilt with Swing");
                        break;
                    case "Submit":
                        String name = nameField.getText().trim();
                        String email = emailField.getText().trim();
                        if (name.isEmpty() || email.isEmpty()) {
                            JOptionPane.showMessageDialog(SimpleDesktopApp.this, "Please fill in all fields.", "Input Error", JOptionPane.WARNING_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(SimpleDesktopApp.this, "Submitted: " + name + ", " + email, "Success", JOptionPane.INFORMATION_MESSAGE);
                            statusLabel.setText("Form submitted successfully");
                        }
                        break;
                }
            }
        };

        // Add listeners to all components
        for (Component comp : getJMenuBar().getComponents()) {
            if (comp instanceof JMenu) {
                for (Component item : ((JMenu) comp).getMenuComponents()) {
                    if (item instanceof JMenuItem) {
                        ((JMenuItem) item).addActionListener(actionListener);
                    }
                }
            }
        }

        for (Component comp : ((JToolBar) getContentPane().getComponent(0)).getComponents()) {
            if (comp instanceof JButton) {
                ((JButton) comp).addActionListener(actionListener);
            }
        }

        // Submit button
        JPanel center = (JPanel) getContentPane().getComponent(1);
        for (Component comp : center.getComponents()) {
            if (comp instanceof JButton) {
                ((JButton) comp).addActionListener(actionListener);
            }
        }
    }

    /**
     * Main method to launch the application.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SimpleDesktopApp().setVisible(true);
        });
    }
}