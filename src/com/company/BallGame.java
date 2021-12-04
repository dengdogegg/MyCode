package com.company;

import java.awt.*;
import javax.swing.*;


public class BallGame extends JFrame {
    Image ball=Toolkit.getDefaultToolkit().getImage("images/Ball.png");
    Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.png");

    double x = 200;
    double y = 200;
    boolean right = true;  // 控制小球水平位移的方向

    //绘制窗口
    public void paint(Graphics g){
        System.out.println("窗口被画一次！");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int) x,(int)y,null);
        if (right){
            x = x+10;
        }else {
            x= x-10;
        }
        if (x>856){
            right= false;
        }
        if (x<0){
            right= true;
        }



    }

    //创建窗口
    void  launchFrame(){
        setSize(856,501);  //创建像素长856像素宽501的弹框
        setLocation(100,100);   //弹框在屏幕左上角x轴100距离，y轴100距离
        setVisible(true);

        //实现动画
        while(true){

            repaint();
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("我的小游戏开始了");
        BallGame game= new BallGame();
        game.launchFrame();
    }

}
