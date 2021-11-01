package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminCamere {
    private JButton Camera1;
    private JButton camera3Button;
    private JButton camera2Button;
    private JButton camera4Button;
    private JButton camera6Button;
    private JButton camera8Button;
    private JButton camera10Button;
    private JButton camera12Button;
    private JButton camera13Button;
    private JButton camera5Button;
    private JButton camera7Button;
    private JButton camera9Button;
    private JButton camera11Button;
    private JButton camera14Button;
    private JButton camera15Button;
    private JPanel adminCamere;
    private JFrame adminCameref;

    private AdminLogin adminLogin;
    private MainMenu mainMenu;

    public AdminCamere(AdminLogin adminLogin, MainMenu mainMenu) {
        this.adminCameref = new JFrame("Camere admin");
        this.mainMenu = mainMenu;
        this.adminLogin = adminLogin;

        Camera1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        camera2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        camera3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        camera4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        camera5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        camera6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        camera7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        camera8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        camera9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        camera10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        camera11Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        camera12Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        camera13Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        camera14Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        camera15Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

    public void displayadminCamere(){
        adminCameref.setContentPane(this.adminCamere);
        adminCameref.setSize(1920,1080);
        adminCameref.setVisible(true);
        adminCameref.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JPanel getAdminCamere(){return adminCamere;}
}
