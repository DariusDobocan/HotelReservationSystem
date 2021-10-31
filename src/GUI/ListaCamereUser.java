package GUI;

import Classes.CitireExcel;
import Classes.Room;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListaCamereUser {
    private JComboBox comboBox1;
    private JButton sortatiButton;
    private JList Camere;

    public ListaCamereUser() {

        Room[] _room = new Room[15];
        CitireExcel x = new CitireExcel();

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
