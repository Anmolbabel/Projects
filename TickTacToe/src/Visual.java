import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Visual extends JFrame implements ActionListener {
    boolean checker=false;
    int count=0;
    TicTac t=new TicTac();
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button10;
    JLabel label=new JLabel();
    JLabel label2=new JLabel();
    JLabel label3=new JLabel();
    JLabel label4=new JLabel();
    JLabel label5=new JLabel();
    JLabel label6=new JLabel();
    JLabel label7=new JLabel();
    JLabel label8=new JLabel();
    JLabel label9=new JLabel();
    JLabel label10=new JLabel();

    Visual(){

        label.setBounds(0,50,50,50);
        label2.setBounds(50,50,50,50);
        label3.setBounds(100,50,50,50);
        label4.setBounds(0,100,50,50);
        label5.setBounds(50,100,50,50);
        label6.setBounds(100,100,50,50);
        label7.setBounds(0,150,50,50);
        label8.setBounds(50,150,50,50);
        label9.setBounds(100,150,50,50);
        label10.setBounds(150,10,100,50);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label2.setVerticalAlignment(JLabel.CENTER);
        label2.setHorizontalAlignment(JLabel.CENTER);
        label3.setVerticalAlignment(JLabel.CENTER);
        label3.setHorizontalAlignment(JLabel.CENTER);
        label4.setVerticalAlignment(JLabel.CENTER);
        label4.setHorizontalAlignment(JLabel.CENTER);
        label5.setVerticalAlignment(JLabel.CENTER);
        label5.setHorizontalAlignment(JLabel.CENTER);
        label6.setVerticalAlignment(JLabel.CENTER);
        label6.setHorizontalAlignment(JLabel.CENTER);
        label7.setVerticalAlignment(JLabel.CENTER);
        label7.setHorizontalAlignment(JLabel.CENTER);
        label8.setVerticalAlignment(JLabel.CENTER);
        label8.setHorizontalAlignment(JLabel.CENTER);
        label9.setVerticalAlignment(JLabel.CENTER);
        label9.setHorizontalAlignment(JLabel.CENTER);

        button1=new JButton("X");
        button2=new JButton("X");
        button3=new JButton("X");
        button4=new JButton("X");
        button5=new JButton("X");
        button6=new JButton("X");
        button7=new JButton("X");
        button8=new JButton("X");
        button9=new JButton("X");
        button10=new JButton("Restart");
        button1.setBounds(200,50,50,50);
        button2.setBounds(250,50,50,50);
        button3.setBounds(300,50,50,50);
        button4.setBounds(200,100,50,50);
        button5.setBounds(250,100,50,50);
        button6.setBounds(300,100,50,50);
        button7.setBounds(200,150,50,50);
        button8.setBounds(250,150,50,50);
        button9.setBounds(300,150,50,50);
        button10.setBounds(250,10,100,30);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);

        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);
        button4.setFocusable(false);
        button5.setFocusable(false);
        button6.setFocusable(false);
        button7.setFocusable(false);
        button8.setFocusable(false);
        button9.setFocusable(false);
        button10.setFocusable(false);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        panel1.setBackground(Color.BLACK);
        panel2.setBackground(Color.BLACK);
        panel3.setBackground(Color.BLACK);
        panel4.setBackground(Color.BLACK);

        panel1.setBounds(48,50,4,150);
        panel2.setBounds(98,50,4,150);
        panel3.setBounds(0,98,150,4);
        panel4.setBounds(0,148,150,4);

        this.setVisible(true);
        this.setSize(370,240);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(button8);
        this.add(button9);
        this.add(button10);
        this.add(label);
        this.add(label2);
        this.add(label3);
        this.add(label4);
        this.add(label5);
        this.add(label6);
        this.add(label7);
        this.add(label8);
        this.add(label9);
        this.add(label10);
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.add(panel4);
        this.setResizable(false);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button1){
            setLabel(label,0,0);
            button1.setEnabled(false);
        }else if(e.getSource()==button2){
            setLabel(label2,0,1);
            button2.setEnabled(false);
        }else if(e.getSource()==button3){
            setLabel(label3,0,2);
            button3.setEnabled(false);
        }else if(e.getSource()==button4){
            setLabel(label4,1,0);
            button4.setEnabled(false);
        }else if(e.getSource()==button5){
            setLabel(label5,1,1);
            button5.setEnabled(false);
        }else if(e.getSource()==button6){
            setLabel(label6,1,2);
            button6.setEnabled(false);
        }else if(e.getSource()==button7){
            setLabel(label7,2,0);
            button7.setEnabled(false);
        }else if(e.getSource()==button8){
            setLabel(label8,2,1);
            button8.setEnabled(false);
        }else if(e.getSource()==button9){
            setLabel(label9,2,2);
            button9.setEnabled(false);
        }else if(e.getSource()==button10){
            EnableButton();
        }
    }

    public  void setButton(char a){
        if(a=='X'){
            button1.setText("0");
            button2.setText("0");
            button3.setText("0");
            button4.setText("0");
            button5.setText("0");
            button6.setText("0");
            button7.setText("0");
            button8.setText("0");
            button9.setText("0");
        }else{
            button1.setText("X");
            button2.setText("X");
            button3.setText("X");
            button4.setText("X");
            button5.setText("X");
            button6.setText("X");
            button7.setText("X");
            button8.setText("X");
            button9.setText("X");
        }
    }

    public void setLabel(JLabel label,int row,int col){
        count++;
        if(checker){
            label.setText("0");
            checker=false;
            setButton('0');
            TicTac.arr[row][col]=2;
            boolean a=TicTac.check(TicTac.arr);

            if(!a){
                label10.setText("0 Wins");
                DisableButton();
            }else if(count==9){
                label10.setText("No Win");
            }
        }else{
            label.setText("X");
            checker=true;
            setButton('X');
            TicTac.arr[row][col]=1;
            boolean a=TicTac.check(TicTac.arr);
            if(!a){
                label10.setText("X Wins");
                DisableButton();
            }else if(count==9){
                label10.setText("No Win");
            }
        }

    }

    public void EnableButton(){
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);

        TicTac.arr=new int[3][3];
        label.setText("");
        label2.setText("");
        label3.setText("");
        label4.setText("");
        label5.setText("");
        label6.setText("");
        label7.setText("");
        label8.setText("");
        label9.setText("");
        label10.setText("");

        count=0;
    }
    public void DisableButton(){
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
    }

}
