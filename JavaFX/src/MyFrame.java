import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Exit on clicking X
        this.setTitle("WOW"); // Sets Title
        this.setSize(420,420); // Sets size
        this.setResizable(false); // Sets Resizable frame to false
        this.setVisible(true); // Sets frame to Visible

        ImageIcon image=new ImageIcon("D:\\Games\\JavaFX\\Rare.png");
        this.setIconImage(image.getImage()); // Sets icon of frame
//        for(int i=0;i<256;i++){
//                Thread.sleep(50);
//            jFrame.getContentPane().setBackground(new Color(i,i,i));
//        }
        this.getContentPane().setBackground(Color.gray);
//        this.setBackground(Color.gray);

    }
}
