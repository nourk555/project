import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcommerceSystemGUI extends JFrame {
    private JTextField customerIdField;
    private JTextField nameField;
    private JTextField addressField;
    private JTextArea outputArea;
    private JComboBox<String> productComboBox;
    private JButton addProductButton;
    private JButton placeOrderButton;

    public EcommerceSystemGUI() {
        setTitle("E-Commerce System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        inputPanel.add(new JLabel("Customer ID:"));
        customerIdField = new JTextField();
        inputPanel.add(customerIdField);
        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Address:"));
        addressField = new JTextField();
        inputPanel.add(addressField);
        inputPanel.add(new JLabel("Product:"));
        String[] products = {"Smartphone", "T-Shirt", "Book"};
        productComboBox = new JComboBox<>(products);
        inputPanel.add(productComboBox);

        addProductButton = new JButton("Add Product");
        inputPanel.add(addProductButton);
        placeOrderButton = new JButton("Place Order");
        inputPanel.add(placeOrderButton);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        addProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement adding product action
                outputArea.append("Product added\n");
            }
        });

        placeOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement place order action
                outputArea.append("Order placed\n");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                EcommerceSystemGUI gui = new EcommerceSystemGUI();
                gui.setVisible(true);
            }
        });
    }
}
