import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame1 extends JFrame implements ActionListener {
    JButton button;
    MyFrame1(){
        button=new JButton();
        button.setBounds(200,100,100,50);
        button.addActionListener(this);

        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(button);

        String a="new";

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("WOW");
        }
    }
}
