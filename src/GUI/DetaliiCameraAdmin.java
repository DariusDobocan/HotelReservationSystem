package GUI;

import Classes.CitireExcel;
import Classes.ScriereExcel;
import Classes.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DetaliiCameraAdmin {

    private JButton eliberatiButton;
    private JPanel MyPanel;
    private JLabel label1;
    private JLabel label2;
    private JFrame mypannelF;

    private AdminCamere adminCamere;

    public DetaliiCameraAdmin(AdminCamere adminCamere, int i) {
        this.mypannelF = new JFrame("Camera utilizata");
        this.adminCamere = adminCamere;
        CitireExcel x = new CitireExcel();
        ScriereExcel w = new ScriereExcel();
        String firstName, lastName, id, phoneNumber, email;
        firstName = x.ReadCellData(i, 1, User.fisU());
        lastName = x.ReadCellData(i, 0, User.fisU());
        phoneNumber = x.ReadCellData(i, 3, User.fisU());
        email = x.ReadCellData(i, 2, User.fisU());
        id = x.ReadCellData(i, 4, User.fisU());
        int verificare = 1;
        if (firstName.equals("Empty")) {
            verificare = 0;
        }

        if (verificare == 1) {
            label1.setText(firstName + " " + lastName);
            label2.setText(firstName + " " + lastName + " " + phoneNumber + " " + email + " " + id);
        } else {
            label1.setText(" ");
            label2.setText(" ");
        }
        eliberatiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                w.WriteCellData(i, 0, User.fisU(), "Empty");
                w.WriteCellData(i, 1, User.fisU(), "Empty");
                w.WriteCellData(i, 2, User.fisU(), "Empty");
                w.WriteCellData(i, 3, User.fisU(), "Empty");
                w.WriteCellData(i, 4, User.fisU(), "Empty");

            }

        });
    }

    public void displaycameradetaliadmin() {
        mypannelF.setContentPane(this.MyPanel);
        mypannelF.setSize(1920, 1080);
        mypannelF.setVisible(true);
        mypannelF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JPanel getMypanel() {
        return MyPanel;
    }
}

