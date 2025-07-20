import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        /*JFrame jFrame=new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Exit on clicking X
        jFrame.setTitle("WOW"); // Sets Title
        jFrame.setSize(420,420); // Sets size
        jFrame.setResizable(false); // Sets Resizable frame to false
        jFrame.setVisible(true); // Sets frame to Visible

        ImageIcon image=new ImageIcon("D:\\Games\\JavaFX\\Rare.png");
        jFrame.setIconImage(image.getImage()); // Sets icon of frame
//        for(int i=0;i<256;i++){
//                Thread.sleep(50);
//            jFrame.getContentPane().setBackground(new Color(i,i,i));
//        }
        jFrame.getContentPane().setBackground(Color.gray);
                 */
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton button =new JButton();
        button.setBounds(100,100,100,50);
        frame.add(button);
        button.setText("Button");
        JLabel label=new JLabel("NIcee");
        label.setBounds(100,50,50,50);
        frame.add(label);

        ActionListener l=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==button){
//                    frame.add(label);
                    label.setText("Its Good");
                }
            }
        };
        button.addActionListener(l);

//        MyFrame1 frame=new MyFrame1();
    }
}
