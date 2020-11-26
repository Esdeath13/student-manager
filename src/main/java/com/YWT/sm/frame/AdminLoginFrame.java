package com.YWT.sm.frame;

import com.YWT.sm.factory.ServiceFacotry;
import com.YWT.sm.utils.ResultEntity;

import javax.swing.*;

/**
 * @ClassName AdminLoginFrame
 * @Description TODO
 * @Author YWT
 * @Date 2020/11/23 18:05
 **/
public class AdminLoginFrame extends JFrame{
    private JPanel mainPanel;
    private JTextField accountField;
    private JButton loginBtn;
    private JButton resetBtn;
    private JPasswordField passwordField;

    public AdminLoginFrame(){
        this.setTitle("AdminLoginFrame");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


        loginBtn.addActionListener(e -> {
            String account = accountField.getText().trim();
            String password = new String(passwordField.getPassword()).trim();
            ResultEntity resultEntity = ServiceFacotry.getAdminServiceInstance().adminLogin(account,password);
            JOptionPane.showMessageDialog(mainPanel,resultEntity.getMessage());
            if (resultEntity.getCode() == 0){
                this.dispose();
                new MainFrame();
            }else{
                accountField.setText("");
                passwordField.setText("");
            }
        });
        resetBtn.addActionListener(e -> {
            accountField.setText("");
            passwordField.setText("");
        });
    }

    public static void main(String[] args) {
        new AdminLoginFrame();
    }
}
