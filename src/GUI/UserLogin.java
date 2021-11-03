package GUI;

import Classes.CitireExcel;
import Classes.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLogin {
    private JTextField Name;
    private JPasswordField PasswordUser;
    private JPanel SecondPanel;
    private JButton Logare;
    private JButton mainMenuButton;
    private JFrame UserMenu;

    private MainMenu mainMenu;
    private ListaCamereUser listaCamereUser;

    public UserLogin(MainMenu mainMenu) {
        this.UserMenu = new JFrame("User Login");
        this.mainMenu = mainMenu;
        this.listaCamereUser = new ListaCamereUser(this.mainMenu);
        CitireExcel x = new CitireExcel();

        Logare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = Name.getText();
                String s = new String(PasswordUser.getPassword());
                s.valueOf(PasswordUser.getPassword());
                String name, id;
                for (int i = 1; i <= 15; ++i) {
                    name = String.valueOf(x.ReadCellData(i, 0, User.fisU()));
                    id = String.valueOf(x.ReadCellData(i, 4, User.fisU()));

                    if (text.equals(name) && s.equals(id) && text!="Empty") {
                        listaCamereUser.displayCamereOferteFrame();
                        UserMenu.setVisible(false);
                    }
                }
            }
        });

        mainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenu.displayMainMenu();
                UserMenu.setVisible(false);
            }
        });
    }

    public void displayUserMenu() {
        UserMenu.setContentPane(this.SecondPanel);
        UserMenu.setSize(500, 300);
        UserMenu.setVisible(true);
        UserMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public JPanel getMainPanel() {
        return SecondPanel;
    }
}
