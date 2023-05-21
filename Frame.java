package Treino;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame(Panel janela) {
        setPreferredSize(new Dimension(500,500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(janela);
        pack();
        setVisible(true);
    }
}
