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
    private JPanel CamereOferte;
    private JFrame CamereOferteFrame;

    private MainMenu mainMenu;

    public ListaCamereUser(MainMenu mainMenu) {

        CamereOferteFrame = new JFrame("Oferte");
        this.mainMenu = mainMenu;
        Room[] _room = new Room[15];
        CitireExcel x = new CitireExcel();

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String sortare = comboBox1.getActionCommand();
                if (sortare == "Pret Crescator") {

                }
            }
        });
    }
}
