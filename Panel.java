package Treino;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel implements ActionListener {
    JButton button = new JButton("Enviar");
    JTextField texto = new JTextField("Escreva aqui");

    public Panel(){
        texto.setBackground(Color.black);
        texto.setForeground(Color.white);
        texto.setFont(new Font("Arial",Font.PLAIN,15));
        texto.setBounds(50,90,100,100);


        button.setBackground(new Color(0x480D6D7A, true));
        button.addActionListener(this);
        button.setBounds(50,100,100,40);

        add(texto);
        add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            JOptionPane optionPane = new JOptionPane();
            optionPane.showMessageDialog(null,"Bem vindo "+texto.getText(),"Titulo",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
