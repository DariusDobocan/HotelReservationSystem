package GUI;

import Classes.Person;
import Classes.User;

import javax.swing.*;
import java.awt.desktop.SystemSleepEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminLogin {
    private JTextField Text;
    private JPasswordField Password;
    private JButton Logare;
    private JPanel adminLogin;
    private JButton Mainmenubutton;
    private JFrame AdminLoginMenu;

    private MainMenu mainMenu;
    private AdminCamere adminCamere;

    public AdminLogin(MainMenu mainMenu) {
        Person[] _user = new User[50];

        this.AdminLoginMenu = new JFrame("AdminLogin");
        this.mainMenu = mainMenu;
        this.adminCamere = new AdminCamere(this, this.mainMenu);

        Logare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String S = Text.getName();
                System.out.println(S);
                
                adminCamere.displayadminCamere();
                AdminLoginMenu.setVisible(false);
            }
        });

        Mainmenubutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenu.displayMainMenu();
                AdminLoginMenu.setVisible(false);
            }
        });

    }

    public void displayAdminLogin() {
        AdminLoginMenu.setContentPane(this.adminLogin);
        AdminLoginMenu.setSize(1920, 1080);
        AdminLoginMenu.setVisible(true);
        AdminLoginMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JPanel getAdminLogin() {
        return adminLogin;
    }
}
