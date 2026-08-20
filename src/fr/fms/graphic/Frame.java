package fr.fms.graphic;

import javax.swing.*;

public class Frame extends JFrame {

    public Frame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Shapes challenge");
        setSize(350, 250);

        add(new Panel());

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
