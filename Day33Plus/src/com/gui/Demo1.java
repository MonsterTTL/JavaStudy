package com.gui;

import java.awt.*;
import java.awt.event.*;

public class Demo1 {
    public static void main(String[] args) {
        Frame frame = new Frame("通信工程");
        frame.setSize(600,600);//设置窗体宽和高
        frame.setLocation(500,300);//设置窗口位置
        frame.setIconImage(Toolkit.getDefaultToolkit().createImage("qq.jpg"));
        //FlowLayout 流式布局管理器
        //BorderLayout 边界布局管理器
        //GridLayout 网格布局管理器
        //CardLayout 卡片布局管理器
        //CridBagLayout 网格包布局管理器
        Button b1 = new Button("Botton1");
        b1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_Q)
                    System.out.println("走私机牛逼！！！");
                else  if(e.getKeyCode() == 32)
                    System.exit(0);

            }
        });
        b1.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent event)
            {
                System.exit(0);
            }
        });//鼠标监听

        Button b2 = new Button("Botton2");
        b2.addActionListener(new ActionListener() {   //添加动作监听，用于暂停和播放视频
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("旺仔小馒头");
            }
        });
        frame.add(b2);
        frame.add(b1);
        frame.setLayout(new FlowLayout());//设置布局管理器
        frame.addWindowListener(new MyWindowListener());//添加窗口监听
        frame.setVisible(true);  //设置窗口可见
    }
}

class MyWindowListener implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Closing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}


