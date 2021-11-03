package GUI;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminLogin {
    private JTextField Text;
    private JPasswordField Password;
    private JButton Logare;
    private JPanel adminLogin;
    private JButton Mainmenubutton;
    private JFrame AdminLoginMenu;

    private MainMenu mainMenuf;
    private AdminCamere adminCamere;

    public AdminLogin(MainMenu mainMenu) {
        this.AdminLoginMenu = new JFrame("AdminLogin");
        this.mainMenuf = mainMenu;
        this.adminCamere = new AdminCamere(this.mainMenuf);

        Logare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = Text.getText();
                String s = new String(Password.getPassword());
                s.valueOf(Password.getPassword());
                if (text.equals("Admin") && s.equals("ParolaAdmin")) {

                    adminCamere.displayadminCamere();
                    AdminLoginMenu.setVisible(false);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Ati introdus datele gresit");
                }
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
        AdminLoginMenu.setSize(500, 300);
        AdminLoginMenu.setVisible(true);
        AdminLoginMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JPanel getAdminLogin() {
        return adminLogin;
    }
}
