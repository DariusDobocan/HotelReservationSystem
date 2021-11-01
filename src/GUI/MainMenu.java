package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu {
    private JButton Admin;
    private JButton User;
    private JPanel MainPanel;
    private final JFrame mainMenu;

    private final AdminLogin adminLogin;
    private final UserLogin userLogin;

    public MainMenu() {
        this.mainMenu = new JFrame("Main Menu");
        this.adminLogin = new AdminLogin(this);
        this.userLogin = new UserLogin(this);

        Admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminLogin.displayAdminLogin();
                mainMenu.setVisible(false);
            }
        });

        User.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userLogin.displayUserMenu();
                mainMenu.setVisible(false);
            }
        });
    }

    public void displayMainMenu() {
        mainMenu.setContentPane(this.MainPanel);
        mainMenu.setSize(1920, 1080);
        mainMenu.setVisible(true);
        mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JPanel getMainPanel() {
        return MainPanel;
    }
}
