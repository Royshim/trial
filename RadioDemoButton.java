package RadioButtonDemo;

import javax.swing.*;

public class RadioDemoButton {
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JRadioButton radioButton
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    public class RadioButtonDemo extends JFrame implements ActionListener {
        private JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
        private JLabel imageLabel;
        private ButtonGroup group;

        public RadioButtonDemo() {
            setTitle("RadioButtonDemo");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(300, 250);
            setLayout(new FlowLayout());

            // Create radio buttons
            birdButton = new JRadioButton("Bird");
            catButton = new JRadioButton("Cat");
            dogButton = new JRadioButton("Dog");
            rabbitButton = new JRadioButton("Rabbit");
            pigButton = new JRadioButton("Pig");

            // Group the radio buttons
            group = new ButtonGroup();
            group.add(birdButton);
            group.add(catButton);
            group.add(dogButton);
            group.add(rabbitButton);
            group.add(pigButton);

            // Add action listeners
            birdButton.addActionListener(this);
            catButton.addActionListener(this);
            dogButton.addActionListener(this);
            rabbitButton.addActionListener(this);
            pigButton.addActionListener(this);

            // Create image label (placeholder for now)
            imageLabel = new JLabel("Select a pet to see its image");

            // Add components to frame
            add(birdButton);
            add(catButton);
            add(dogButton);
            add(rabbitButton);
            add(pigButton);
            add(imageLabel);

            setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
            String pet = "";
            if (e.getSource() == birdButton) pet = "Bird";
            else if (e.getSource() == catButton) pet = "Cat";
            else if (e.getSource() == dogButton) pet = "Dog";
            else if (e.getSource() == rabbitButton) pet = "Rabbit";
            else if (e.getSource() == pigButton) pet = "Pig";

            imageLabel.setText("You selected: " + pet);
            JOptionPane.showMessageDialog(this, "You selected: " + pet);
        }

        public static void main(String[] args) {
            new RadioButtonDemo();
        }
    }