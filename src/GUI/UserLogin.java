package GUI;

import Classes.Person;
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
        Person[] _user = new User[50];
        this.UserMenu = new JFrame("User Login");
        this.mainMenu = mainMenu;
        this.listaCamereUser = new ListaCamereUser(this.mainMenu);

        Logare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = Name.getText();
                String s = new String(PasswordUser.getPassword());
                s.valueOf(PasswordUser.getPassword());
                for (int i = 1; i <= 15; ++i) {
                    if (text.equals(_user[i].get_firstName()) && s.equals(_user[i].get_id())) {

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
        UserMenu.setSize(1920, 1080);
        UserMenu.setVisible(true);
    }

    public JPanel getMainPanel() {
        return SecondPanel;
    }
}
