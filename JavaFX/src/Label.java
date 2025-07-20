import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Label {
    public static void main(String[] args) {
        ImageIcon image=new ImageIcon("D:\\Games\\JavaFX\\Rare.png");
        Border border= BorderFactory.createLineBorder(Color.BLACK,3);

        JLabel label=new JLabel(); // Create a label
        label.setSize(420,420);
        label.setText("Tic Tac Toe"); // sets text in frame
        label.setIcon(image); // Sets image in frame

        label.setVerticalTextPosition(JLabel.TOP); // Position of Text
        label.setHorizontalTextPosition(JLabel.CENTER); // Position of text
        label.setForeground(Color.BLACK); // Sets color of text
        label.setFont(new Font("Dialog",Font.BOLD,20)); // Sets Font
        label.setIconTextGap(10); // set gap of text to image
        label.setBackground(Color.GRAY); // Sets Color of background
        label.setOpaque(true); // To display the color of background
        label.setBorder(border); // To set a border
        label.setVerticalAlignment(JLabel.CENTER); // To set label vertical alignment
        label.setHorizontalAlignment(JLabel.CENTER); // To set label horizontal alignment
        label.setBounds(0,0,410,400);

        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setSize(420,420);
//        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(label);
        frame.pack();

    }
}
