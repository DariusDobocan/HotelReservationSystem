package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLogin {
    private JTextField Name;
    private JPasswordField PasswordUser;
    private JPanel SecondPanel;
    private JButton Logare;
    private JFrame UserMenu;

    public UserLogin(){
        Logare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void displayUserMenu(){
        UserMenu.setContentPane(this.SecondPanel);
        UserMenu.setSize(1920, 1080);
        UserMenu.setVisible(true);
    }

    public JPanel getMainPanel(){return SecondPanel;}
}
