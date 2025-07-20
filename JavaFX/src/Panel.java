import javax.swing.*;
import java.awt.*;

public class Panel {
    public static void main(String[] args) {

        JPanel redPanel=new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,250,250);

        JLabel label =new JLabel("Yoo");
        label.setFont(new Font("Dialog",Font.BOLD,25));
//        label.setVerticalAlignment(JLabel.CENTER);
//        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,250,250);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBackground(Color.BLACK);
//        label.setOpaque(true);
//        label.setSize(50,125);
        redPanel.setLayout(null);
        redPanel.add(label);


        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.add(redPanel);

        frame.setVisible(true);
    }


}
