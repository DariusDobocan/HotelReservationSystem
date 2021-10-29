package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu {
    private JButton Admin;
    private JButton User;
    private JPanel MainPanel;
    private JFrame MainMenu;

    public MainMenu(){
        this.MainMenu = new JFrame("Main Menu");

        Admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        User.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void displayMainMenu(){
        MainMenu.setContentPane(this.MainPanel);
        MainMenu.setSize(1920, 1080);
        MainMenu.setVisible(true);
    }

    public JPanel getMainPanel(){return MainPanel;}
}
