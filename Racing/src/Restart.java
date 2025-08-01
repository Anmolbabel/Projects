import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Restart {
    JFrame frame2;
    JLabel label_res;
    JButton button;
    ActionListener l=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                frame2.dispose();
                Test2 t=new Test2();
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
    };

    Restart(int dist){
        button=new JButton("Restart");
        button.setFocusable(false);
        button.addActionListener(l);

        label_res =new JLabel(" Score : " + dist);
        label_res.setFont(new Font(Font.DIALOG,Font.BOLD,25));
        label_res.setPreferredSize(new Dimension(200,50));
        label_res.setHorizontalTextPosition(JLabel.CENTER);
        label_res.setVerticalTextPosition(JLabel.CENTER);



        frame2 =new JFrame();
        frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame2.setPreferredSize(new Dimension(200,200));
        frame2.setLayout(new FlowLayout());
        frame2.add(label_res);
        frame2.add(button);
        frame2.setVisible(true);
        frame2.setLocationRelativeTo(null);
        frame2.pack();
    }
}
