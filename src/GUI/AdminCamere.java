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
    private DetaliiCameraAdmin detaliiCameraAdmin;

    public AdminCamere(MainMenu mainMenu) {
        this.adminCameref = new JFrame("Camere admin");
        this.mainMenu = mainMenu;


        Camera1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detaliiCameraAdmin = new DetaliiCameraAdmin(AdminCamere.this,  1);
                detaliiCameraAdmin.displaycameradetaliadmin();
                adminCameref.setVisible(false);

            }
        });

        camera2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detaliiCameraAdmin = new DetaliiCameraAdmin(AdminCamere.this,  2);
                detaliiCameraAdmin.displaycameradetaliadmin();
                adminCameref.setVisible(false);
            }
        });

        camera3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detaliiCameraAdmin = new DetaliiCameraAdmin(AdminCamere.this,  3);
                detaliiCameraAdmin.displaycameradetaliadmin();
                adminCameref.setVisible(false);
            }
        });

        camera4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detaliiCameraAdmin = new DetaliiCameraAdmin(AdminCamere.this,  4);
                detaliiCameraAdmin.displaycameradetaliadmin();
                adminCameref.setVisible(false);            }
        });

        camera5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detaliiCameraAdmin = new DetaliiCameraAdmin(AdminCamere.this,  5);
                detaliiCameraAdmin.displaycameradetaliadmin();
                adminCameref.setVisible(false);
            }
        });

        camera6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detaliiCameraAdmin = new DetaliiCameraAdmin(AdminCamere.this,  6);
                detaliiCameraAdmin.displaycameradetaliadmin();
                adminCameref.setVisible(false);
            }
        });

        camera7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detaliiCameraAdmin = new DetaliiCameraAdmin(AdminCamere.this,  7);
                detaliiCameraAdmin.displaycameradetaliadmin();
                adminCameref.setVisible(false);
            }
        });

        camera8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detaliiCameraAdmin = new DetaliiCameraAdmin(AdminCamere.this,  8);
                detaliiCameraAdmin.displaycameradetaliadmin();
                adminCameref.setVisible(false);
            }
        });

        camera9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detaliiCameraAdmin = new DetaliiCameraAdmin(AdminCamere.this,  9);
                detaliiCameraAdmin.displaycameradetaliadmin();
                adminCameref.setVisible(false);            }
        });

        camera10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detaliiCameraAdmin = new DetaliiCameraAdmin(AdminCamere.this,  10);
                detaliiCameraAdmin.displaycameradetaliadmin();
                adminCameref.setVisible(false);            }
        });

        camera11Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detaliiCameraAdmin = new DetaliiCameraAdmin(AdminCamere.this,  11);
                detaliiCameraAdmin.displaycameradetaliadmin();
                adminCameref.setVisible(false);
            }
        });

        camera12Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detaliiCameraAdmin = new DetaliiCameraAdmin(AdminCamere.this,  12);
                detaliiCameraAdmin.displaycameradetaliadmin();
                adminCameref.setVisible(false);
            }
        });

        camera13Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detaliiCameraAdmin = new DetaliiCameraAdmin(AdminCamere.this,  13);
                detaliiCameraAdmin.displaycameradetaliadmin();
                adminCameref.setVisible(false);
            }
        });

        camera14Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detaliiCameraAdmin = new DetaliiCameraAdmin(AdminCamere.this,  14);
                detaliiCameraAdmin.displaycameradetaliadmin();
                adminCameref.setVisible(false);
            }
        });

        camera15Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detaliiCameraAdmin = new DetaliiCameraAdmin(AdminCamere.this,  15);
                detaliiCameraAdmin.displaycameradetaliadmin();
                adminCameref.setVisible(false);            }
        });

    }

    public void displayadminCamere() {
        adminCameref.setContentPane(this.adminCamere);
        adminCameref.setSize(1920, 1080);
        adminCameref.setVisible(true);
        adminCameref.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JPanel getAdminCamere() {
        return adminCamere;
    }
}
