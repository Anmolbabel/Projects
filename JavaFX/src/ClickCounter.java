import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ClickCounter {

    static JFrame frame=new JFrame();
    static int count=0;
    public static void frames(){

        JButton button =new JButton("Click me");
        button.setBounds(50,50 ,100,40);
        JLabel label =new JLabel();
        label.setBounds(50,100,50,50);
        label.setText("Click");
        ActionListener action =new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("Click : " + count);
                button.setEnabled(false);
            }
        };

        button.addActionListener(action);
        button.setFocusable(false);
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setSize(200,200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(label);
        frame.add(button);


    }

    public static void main(String[] args) {
        frames();


    }
}
