import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Test2 {
//    Restart





    private static final int MOVE_DEFAULT_NPC =10;
    private static final int MOVE_DEFAULT=20;
    JLabel time_label;
    int dist=0;
    JFrame frame;
    JLabel [] label;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel distance_text;
    JLabel distance;
    boolean checkAccident=false;
    ImageIcon icon=new ImageIcon("car.png");
    ImageIcon icon_road_1 =new ImageIcon("road.png");
    ImageIcon icon_road_2 =new ImageIcon("barricade.png");
//    ImageIcon icon_road_3 =new ImageIcon("road3.png");

    javax.swing.Timer gameTimer;
    javax.swing.Timer timer;

    JLabel car;
    KeyListener k=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            if(!checkAccident){
                switch (e.getKeyChar()){
                    case 'w':
                        car.setLocation(car.getX(),car.getY()-MOVE_DEFAULT);
                        break;
                    case 's':
                        car.setLocation(car.getX(),car.getY()+MOVE_DEFAULT);
                        break;
                    case 'a':
                        car.setLocation(car.getX()-MOVE_DEFAULT,car.getY());
                        break;
                    case 'd':
                        car.setLocation(car.getX()+MOVE_DEFAULT,car.getY());
                        break;
                }
            }

        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    };


    private void move() throws InterruptedException {
        final int [] count={2};

//        AtomicInteger count= new AtomicInteger(3);
        timer=new javax.swing.Timer(1000,e->{
            time_label.setText("" + count[0]);
            if(count[0]==0){
                time_label.setText("Go");
            }
            if(count[0]==-1){
                timer.stop();
                time_label.setVisible(false);
                gameTimer.start();
            }
            count[0]--;
        });
        timer.start();

//        for(int i=3;i>=1;i--){
//            Thread.sleep(1000);
//            time_label.setText("" + i);
//        }
        Random random=new Random();
//        Thread.sleep(2000);



        checkAccident=false;
        gameTimer =new javax.swing.Timer(20, e->{
           if(checkAccident){
                gameTimer.stop();
                new Restart(dist);
                frame.dispose();
           }else{
               if(label[0].getY()==500){
                   label[0].setLocation(0,-1000);
                   label2.setLocation(random.nextInt(100),label2.getY());
               }else if(label[1].getY()==500){
                   label[1].setLocation(0,-1000);
               }else if(label[2].getY()==500){
                   label[2].setLocation(0,-1000);
               }
               dist+=MOVE_DEFAULT_NPC;
               label[0].setLocation(label[0].getX(),label[0].getY()+MOVE_DEFAULT_NPC);
               label[1].setLocation(label[1].getX(),label[1].getY()+MOVE_DEFAULT_NPC);
               label[2].setLocation(label[2].getX(),label[2].getY()+MOVE_DEFAULT_NPC);
               distance.setText(String.valueOf(dist));

               if(label[0].getY()+50 >= car.getY() && label[0].getY()<=car.getY()+145 && label[0].getX()+50>=car.getX()){
                   System.out.println("Accident");
                   checkAccident=true;
               }else if(label[1].getY()+10>=car.getY() && car.getY()+145 >=label[1].getY() && label[1].getX()+200>=car.getX() && car.getX()+70>=label[1].getX()+100){
                   System.out.println("Accident");
                   checkAccident=true;
               }else if(label[2].getY()+20>=car.getY() && label[2].getY()<=car.getY()+145 && label[2].getX()+300>=car.getX() && car.getX()+70>=label[2].getX()+200 ){
                   System.out.println("Accident");
                   checkAccident=true;
               }

           }



        });
//        gameTimer.start();









//        boolean check=true;
//        while(check){
//            while(label[0].getY()<500 && label[1].getY()<500 && label[2].getY()<500){
//                dist+=MOVE_DEFAULT_NPC;
//                label[0].setLocation(label[0].getX(),label[0].getY()+MOVE_DEFAULT_NPC);
//                label[1].setLocation(label[1].getX(),label[1].getY()+MOVE_DEFAULT_NPC);
//                label[2].setLocation(label[2].getX(),label[2].getY()+MOVE_DEFAULT_NPC);
//                distance.setText(String.valueOf(dist));
////                System.out.println(label[0].getX());
//                if(label[0].getY()+50 >= car.getY() && label[0].getY()<=car.getY()+145 && label[0].getX()+50>=car.getX()){
//                    System.out.println("Accident");
//                    break;
//                }else if(label[1].getY()+10>=car.getY() && car.getY()+145 >=label[1].getY() && label[1].getX()+200>=car.getX() && car.getX()+70>=label[1].getX()+100){
//                    System.out.println("Accident");
//                    break;
//                }else if(label[2].getY()+20>=car.getY() && label[2].getY()<=car.getY()+145 && label[2].getX()+300>=car.getX() && car.getX()+70>=label[2].getX()+200 ){
//                    System.out.println("Accident");
//                    break;
//                }
//                Thread.sleep(20);
//            }
//            if(label[0].getY()==500){
//                label[0].setLocation(0,-1000);
//            }else if(label[1].getY()==500){
//                label[1].setLocation(0,-1000);
//            }else if(label[2].getY()==500){
//                label[2].setLocation(0,-1000);
//            }else{
//                checkAccident=true;
//                check=false;
////                label_res.setText(" Score :" + dist);
////                frame2.setVisible(true);
////                new Restart(dist);
////                frame.setVisible(false);
////                break;
//            }
//
//        }
//        if(!check){
//            frame.dispose();
//            new Restart(dist);
//
//        }
    }

    private void Reset() {
        checkAccident=false;
        dist=0;
        distance.setBounds(300,20,100,20);
        distance_text.setBounds(300,0,100,20);
        label2.setBounds(0,0,50,50);
        label3.setBounds(100,0,100,10);
        label4.setBounds(200,0,100,20);
        car.setBounds(0,310,70,145);
        label[0].setBounds(0,0,400,500);
        label[1].setBounds(0,-500,400,500);
        label[2].setBounds(0,500,400,500);
        
        frame.revalidate();
        frame.repaint();
        try {
            move();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    Test2() throws InterruptedException {

        time_label=new JLabel();
        time_label.setForeground(Color.YELLOW);
        time_label.setBounds(150,150,100,100);
        time_label.setFont(new Font(Font.MONOSPACED,Font.BOLD,70));

        time_label.setText("3");

//        Start

        distance=new JLabel();
        distance.setBounds(300,20,100,20);
        distance.setForeground(Color.YELLOW);
        distance.setFont(new Font(Font.DIALOG,Font.BOLD,15));

        distance_text =new JLabel();
        distance_text.setBounds(300,0,100,20);
        distance_text.setForeground(Color.YELLOW);
//        distance.setOpaque(true);
        distance_text.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        distance_text.setText("Distance");

        label2=new JLabel();
        label2.setBounds(0,0,50,50);
        label2.setBackground(Color.RED);
        label2.setOpaque(true);
//        label2.setIcon(icon_road_2);

        label3=new JLabel();
        label3.setBounds(100,0,100,10);
        label3.setBackground(Color.RED);
        label3.setOpaque(true);

        label4=new JLabel();
        label4.setBounds(200,0,100,20);
        label4.setBackground(Color.RED);
        label4.setOpaque(true);

        car=new JLabel();
        car.setBounds(0,310,70,145);
        car.setIcon(icon);
//        car.setBackground(Color.GREEN);
//        car.setOpaque(true);


        label=new JLabel[3];
        label[0]=new JLabel();
        label[1]=new JLabel();
        label[2]=new JLabel();
        label[0].add(label2);
        label[0].setBounds(0,0,400,500);
//        label[0].setBackground(Color.RED);
//        label[0].setOpaque(true);
        label[0].setIcon(icon_road_1);

        label[1].setBounds(0,-500,400,500);
//        label[1].setBackground(Color.BLACK);
//        label[1].setOpaque(true);
        label[1].setIcon(icon_road_1);
        label[1].add(label3);

        label[2].setBounds(0,500,400,500);
//        label[2].setBackground(Color.GRAY);
//        label[2].setOpaque(true);
        label[2].setIcon(icon_road_1);
        label[2].add(label4);

        frame=new JFrame();
        frame.add(time_label);
        frame.add(distance);
        frame.add(distance_text);
        frame.add(car);
        frame.add(label[0]);
        frame.add(label[1]);
        frame.add(label[2]);
        frame.addKeyListener(k);


        frame.setResizable(false);
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        move();

    }
}
