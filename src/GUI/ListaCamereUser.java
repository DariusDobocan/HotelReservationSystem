package GUI;

import Classes.CitireExcel;
import Classes.Room;
import Classes.Sortare;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

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
        Vector<Integer> V_P = new Vector<>();
        Vector<Integer> V_Pc = new Vector<>();
        Vector<String> Oferte = new Vector<>();

        Sortare sort = new Sortare();

        for (int i = 1; i <= 15; ++i) {
            V_P.set(i, x.ReadCellDataInt(i,4, Room.fisR()));
            V_Pc.set(i, _room[i]._pret);
            Oferte.set(i, String.valueOf(_room[i]._pret));
        }

        Camere.setListData(Oferte);


        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String tip = comboBox1.getActionCommand();
                if (tip == "Pret Crescator") {
                    sort.SortarePret(_room);
                } else if (tip == "Numar paturi crescator") {
                    sort.SortareNrPat(_room);
                }
            }
        });
    }

    public void displayCamereOferteFrame() {
        CamereOferteFrame.setContentPane(this.CamereOferte);
        CamereOferteFrame.setSize(1920, 1080);
        CamereOferteFrame.setVisible(true);
        CamereOferteFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JPanel getAdminCamere() {
        return CamereOferte;
    }
}
