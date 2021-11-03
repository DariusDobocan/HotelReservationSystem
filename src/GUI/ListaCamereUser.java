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
        Vector<Integer> Ofertes = new Vector<>();
        Vector<Integer> Ofertep = new Vector<>();
        Ofertep.setSize(50);
        Ofertes.setSize(50);
        Oferte.setSize(50);
        V_P.setSize(50);

        int v[];

        Sortare sort = new Sortare();
        int t = 1;

        for (int i = 1; i <= 15; ++i) {
            String Empty = x.ReadCellData(i, 6, Room.fisR());
            if (Empty.equals("Empty")) {
                Oferte.add(x.ReadCellDataInt(i, 0, Room.fisR()));
                int j = x.ReadCellDataInt(i, 0, Room.fisR());
                V_P.add(j);
                ++t;
            }
        }


        for (int i = 1; i <= t; ++i) {
            if (V_P.elementAt(i) != null) {
                Ofertep.add(i, x.ReadCellDataInt(V_P.elementAt(i), 4, Room.fisR()));
                if (i != 1) {
                    if (Ofertep.elementAt(i - 1) < Ofertep.elementAt(i)) {
                        int aux, aux2;
                        aux = Ofertep.elementAt(i - 1);
                        aux2 = Ofertep.elementAt(i);
                        Ofertep.set(i - 1, aux2);
                        Ofertep.set(i, aux);

                    }
                }
            }
        }
        String[] text = {"as", "adsa"};


        list1.setListData(Oferte);
        final int z = t;

        sortatiDupaPretButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ey = 0;
                for (int i = 1; i <= z; ++i) {
                    if (V_P.elementAt(i) != null) {
                        Ofertep.add(i, x.ReadCellDataInt(V_P.elementAt(i), 4, Room.fisR()));
                        if (i != 1) {
                            if (Ofertep.elementAt(i - 1) < Ofertep.elementAt(i)) {
                                int aux, aux2;
                                aux = Ofertep.elementAt(i - 1);
                                aux2 = Oferte.elementAt(i);
                                Oferte.set(i - 1, aux2);
                                Ofertep.set(i, aux);

                            }
                        }
                    }
                    ey++;
                }
                if (ey == z) {
                    JList list2 = new JList(Ofertep);
                    list2.setListData(Ofertep);
                    list1 = list2;

                }
            }
        });

        sortatiDupaNuPersoaneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 1; i <= z; ++i) {
                    if (V_P.elementAt(i) != null) {
                        int y = V_P.elementAt(i);

                        Ofertes.add(i, x.ReadCellDataInt(y, 2, Room.fisR()));
                        if (i != 1) {
                            if (Ofertes.elementAt(i - 1) < Ofertes.elementAt(i)) {
                                int aux, aux2;
                                aux = Ofertes.elementAt(i - 1);
                                aux2 = Ofertes.elementAt(i);
                                Ofertes.set(i - 1, aux2);
                                Ofertes.set(i, aux);

                            }
                        }
                    }
                    list1 = new JList(Ofertes);
                }
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
