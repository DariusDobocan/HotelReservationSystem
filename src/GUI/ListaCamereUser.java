package GUI;

import Classes.CitireExcel;
import Classes.Room;
import Classes.Sortare;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class ListaCamereUser {
    private JButton sortatiDupaPretButton;
    private JList Camere;
    private JPanel CamereOferte;
    private JList list1;
    private JButton sortatiDupaNuPersoaneButton;
    private JFrame CamereOferteFrame;

    private MainMenu mainMenu;

    public ListaCamereUser(MainMenu mainMenu) {

        CamereOferteFrame = new JFrame("Oferte");
        this.mainMenu = mainMenu;
        Room[] _room = new Room[15];
        CitireExcel x = new CitireExcel();
        Vector<Integer> V_P = new Vector<>();
        Vector<Integer> V_Pc = new Vector<>();
        Vector<Integer> Oferte = new Vector<>();

        int v[];

        Sortare sort = new Sortare();
        int t = 1;

        for (int i = 1; i <= 15; ++i) {
            String Empty = x.ReadCellData(i, 6, Room.fisR());
            if (Empty.equals("Empty")) {
                Oferte.add(x.ReadCellDataInt(i, 0, Room.fisR()));
                V_P.add(x.ReadCellDataInt(i, 4, Room.fisR()));
                V_Pc.add(x.ReadCellDataInt(i, 2, Room.fisR()));
                ++t;
            }
        }

        String[] text = {"as", "adsa"};

        list1.setListData(Oferte);

        sortatiDupaPretButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list1.setListData(Oferte);
                for (int i = 1; i <= 15; ++i) {
                    for (int j = i + 1; j < 15; ++j) {
                        int auxC, aux;
                        if (V_P.elementAt(i) >= V_P.elementAt(j)) {
                            aux = V_P.elementAt(i);
                            auxC = Oferte.elementAt(i);
                            int v2, v2c;
                            v2 = V_P.elementAt(j);
                            v2c = Oferte.elementAt(j);
                            V_P.set(i, v2);
                            Oferte.set(i, v2c);
                            V_P.set(j, aux);
                            Oferte.set(j, auxC);
                        }
                    }
                }
                list1.setListData(Oferte);
            }
        });

        sortatiDupaNuPersoaneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 1; i <= 15; ++i) {
                    for (int j = i + 1; j < 15; ++j) {
                        int aux, auxC;
                        if (V_Pc.elementAt(i) >= V_Pc.elementAt(j)) {
                            aux = V_Pc.elementAt(i);
                            auxC = Oferte.elementAt(i);
                            int v2, v2c;
                            v2 = V_Pc.elementAt(j);
                            v2c = Oferte.elementAt(j);
                            V_Pc.set(i, v2);
                            Oferte.set(i, v2c);
                            V_Pc.set(j, aux);
                            Oferte.set(j, auxC);
                        }
                    }
                }
                list1.setListData(Oferte);
            }
        });
    }

    public void displayCamereOferteFrame() {
        CamereOferteFrame.setContentPane(this.CamereOferte);
        CamereOferteFrame.setSize(700, 500);
        CamereOferteFrame.setVisible(true);
        CamereOferteFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JPanel getAdminCamere() {
        return CamereOferte;
    }
}
