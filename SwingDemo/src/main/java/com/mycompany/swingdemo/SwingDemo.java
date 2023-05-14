        
package com.mycompany.swingdemo;

import javax.swing.*;

public class SwingDemo {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Swing example");
        
        JLabel label = new JLabel("Swing Label");
        JTextField textField = new JTextField("Swing text field");
        JButton button = new JButton("Swing button");
        JCheckBox checkBox = new JCheckBox("Swing checkbox");
        JRadioButton radioButton = new JRadioButton("Swing radio button");
        
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(checkBox);
        frame.add(radioButton);
        
        BoxLayout layout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
        frame.setLayout(layout);
        frame.pack();
        frame.setVisible(true);
        
        }
}
