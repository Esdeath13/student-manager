package com.YWT.sm.frame;

import com.YWT.sm.entity.Department;
import com.YWT.sm.factory.ServiceFacotry;

import javax.naming.Name;
import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * @ClassName MainFrame
 * @Description TODO
 * @Author YWT
 * @Date 2020/11/23 18:54
 **/
public class MainFrame extends JFrame{
    private JPanel mainPanel;
    private JButton 院系管理Button;
    private JButton 班级管理Button;
    private JButton 学生管理Button;
    private JButton 奖惩管理Button;
    private JPanel centerPanel;
    private JPanel departmentPanel;
    private JPanel classPanel;
    private JPanel studentPanel;
    private JPanel rewardPanel;
    private JPanel aPanel;
    private JButton 新增院系Button;
    private JButton 切换显示Button;
    private JPanel addDepPanel;

    private final CardLayout c;




    private void showDepartments(){
        departmentPanel.removeAll();
        List<Department> departmentList = ServiceFacotry.getDepartmentServiceInstance().selectAll();
        int len = departmentList.size();
        int row = len % 4 == 0 ? len / 4 : len / 4 + 1;
        GridLayout gridLayout = new GridLayout(row,4,15,15);
        departmentPanel.setLayout(gridLayout);
        for (Department department : departmentList){
            JPanel depPanel = new JPanel();
            depPanel.setPreferredSize(new Dimension(200,200));
            depPanel.setBorder(BorderFactory.createTitledBorder(department.getDepartmentName()));
            JLabel logoLabel = new JLabel("<html><img src = '" + department.getLogo() + "' width = 200 height = 200/></html>");
            depPanel.add(logoLabel);
            departmentPanel.add(depPanel);
            departmentPanel.revalidate();
        }
    }

    public MainFrame(){
        init();
        c = new CardLayout();
        centerPanel.setLayout(c);
        centerPanel.add("1",departmentPanel);
        centerPanel.add("2",classPanel);
        centerPanel.add("3",studentPanel);
        centerPanel.add("4",rewardPanel);
        院系管理Button.addActionListener(e -> {
            c.show(centerPanel, "1");
        });
        班级管理Button.addActionListener(e -> {
            c.show(centerPanel, "2");
        });
        学生管理Button.addActionListener(e -> {
            c.show(centerPanel, "3");
        });
        奖惩管理Button.addActionListener(e -> {
            c.show(centerPanel, "4");
        });
        showDepartments();
    }
    public void init(){
        this.setTitle("MainFrame");
        this.setContentPane(aPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new MainFrame();
    }
}
