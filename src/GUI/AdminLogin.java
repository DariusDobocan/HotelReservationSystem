package GUI;

import javax.swing.*;

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
        this.AdminLoginMenu = new JFrame("AdminLogin");
        this.mainMenu = mainMenu;
        this.adminCamere = new AdminCamere(this, this.mainMenu);

    }

    public void displayAdminLogin() {
        AdminLoginMenu.setContentPane(this.adminLogin);
        AdminLoginMenu.setSize(1920, 1080);
        AdminLoginMenu.setVisible(true);
    }

    public JPanel getAdminLogin() {
        return adminLogin;
    }
}
