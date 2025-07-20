import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Visual extends JFrame implements ActionListener {
    JButton button0;
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
    JButton button11;
    JButton button12;
    JButton button13;
    JButton button14;
    JButton button15;
    String a="";
    String b="";
    JLabel label0;
    JLabel label1;
    int a1=0;
    int b1=0;

    String op="";

    JPanel panel0;
    Visual(){
        panel0=new JPanel();
        panel0.setBackground(Color.orange);
        panel0.setBounds(150,100,50,200);
        panel0.setLayout(null);

        ImageIcon icon=new ImageIcon("D:\\Games\\Calculator\\Calc.png");

        button1=new JButton("1");
        button2=new JButton("2");
        button3=new JButton("3");
        button4=new JButton("4");
        button5=new JButton("5");
        button6=new JButton("6");
        button7=new JButton("7");
        button8=new JButton("8");
        button9=new JButton("9");
        button0=new JButton("0");
        button10=new JButton("+");
        button11=new JButton("-");
        button12=new JButton("x");
        button13=new JButton("/");
        button14=new JButton("C");
        button15=new JButton("=");

        button0.addActionListener(this);
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
        button11.addActionListener(this);
        button12.addActionListener(this);
        button13.addActionListener(this);
        button14.addActionListener(this);
        button15.addActionListener(this);

        button1.setBounds(0,100,50,50);
        button2.setBounds(50,100,50,50);
        button3.setBounds(100,100,50,50);
        button4.setBounds(0,150,50,50);
        button5.setBounds(50,150,50,50);
        button6.setBounds(100,150,50,50);
        button7.setBounds(0,200,50,50);
        button8.setBounds(50,200,50,50);
        button9.setBounds(100,200,50,50);
        button0.setBounds(50,250,50,50);
        button14.setBounds(0,250,50,50);
        button15.setBounds(100,250,50,50);

        // Panel0
        button10.setBounds(0,0,50,50);
        button11.setBounds(0,50,50,50);
        button12.setBounds(0,100,50,50);
        button13.setBounds(0,150,50,50);


        button0.setFocusable(false);
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
        button11.setFocusable(false);
        button12.setFocusable(false);
        button13.setFocusable(false);
        button14.setFocusable(false);
        button15.setFocusable(false);

        button0.setBackground(Color.lightGray);
        button1.setBackground(Color.lightGray);
        button2.setBackground(Color.lightGray);
        button3.setBackground(Color.lightGray);
        button4.setBackground(Color.lightGray);
        button5.setBackground(Color.lightGray);
        button6.setBackground(Color.lightGray);
        button7.setBackground(Color.lightGray);
        button8.setBackground(Color.lightGray);
        button9.setBackground(Color.lightGray);


        button14.setBackground(new Color(255, 75, 75));
        button15.setBackground(Color.ORANGE);

//        button10.setBorder(BorderFactory.createRaisedBevelBorder());
//        button11.setBorder(BorderFactory.createEtchedBorder());
//        button12.setBorder(BorderFactory.createEtchedBorder());
//        button13.setBorder(BorderFactory.createEtchedBorder());
        button10.setBackground(new Color(255,150,0));
        button11.setBackground(new Color(255,150,0));
        button12.setBackground(new Color(255,150,0));
        button13.setBackground(new Color(255,150,0));


        this.add(button0);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(button8);
        this.add(button9);
        panel0.add(button10);
        panel0.add(button11);
        panel0.add(button12);
        panel0.add(button13);
        this.add(button14);
        this.add(button15);

        label0=new JLabel();
        label1=new JLabel();
        label0.setFont(new Font("Dialog",Font.BOLD,15));
        label0.setBounds(0,20,200,30);
        label1.setFont(new Font("Dialog",Font.BOLD,20));
        label1.setBounds(0,50,200,40);
//        label1.setBounds();
        this.add(label0);
        this.add(label1);
        this.add(panel0);

        this.setIconImage(icon.getImage());
//        this.setTitle("Calculator");
        this.setSize(216,340);
        this.setLayout(null);
//        this.getContentPane().setBackground(Color.gray);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            StringToAdd("1");
            OperationToDo(b,op);
        }else if(e.getSource()==button2){
            StringToAdd("2");
            OperationToDo(b,op);
        }else if(e.getSource()==button3){
            StringToAdd("3");
            OperationToDo(b,op);
        }else if(e.getSource()==button4){
            StringToAdd("4");
            OperationToDo(b,op);
        }else if(e.getSource()==button5){
            StringToAdd("5");
            OperationToDo(b,op);
        }else if(e.getSource()==button6){
            StringToAdd("6");
            OperationToDo(b,op);
        }else if(e.getSource()==button7){
            StringToAdd("7");
            OperationToDo(b,op);
        }else if(e.getSource()==button8){
            StringToAdd("8");
            OperationToDo(b,op);
        }else if(e.getSource()==button9){
            StringToAdd("9");
            OperationToDo(b,op);
        }else if(e.getSource()==button0){
            StringToAdd("0");
            OperationToDo(b,op);
        }else if(e.getSource()==button10){
            StringToAdd("+");
            op="+";
            NumberToAdd();
        }else if(e.getSource()==button11){
            StringToAdd("-");
            op="-";
            NumberToAdd();
        }else if(e.getSource()==button12){
            StringToAdd("x");
            op="x";
            NumberToAdd();
        }else if(e.getSource()==button13){
            StringToAdd("/");
            op="/";
            NumberToAdd();
        }else if(e.getSource()==button14){
            Clear();
        }else if(e.getSource()==button15){
            NumberToAdd();
            a=String.valueOf(b1);
            label0.setText(a);
            label1.setText(a);
        }
    }

    public void OperationToDo(String b,String operation){
        int temp=Integer.parseInt(b);
        switch (operation){
            case "+": b1=a1+temp;break;
            case "-": b1=a1-temp;break;
            case "x": b1=a1*temp;break;
            case "/": b1=a1/temp;break;
        }
        if(operation.isEmpty()){
            b1=temp;
        }
        label1.setText(String.valueOf(b1));

    }

    public void StringToAdd(String add){
        if(!(add.contains("+") || add.contains("-") || add.contains("x") || add.contains("/"))){
            b+=add;
        }
        a+=add;
        label0.setText(a);

    }

    public void NumberToAdd(){
        a1=b1;
        b="";
    }

    public void Operation(String a){
        if(a.contains("+") ){
            a1+=b1;
        }else if( a.contains("-")){
            a1-=b1;
        }else if(a.contains("x")){
            a1*=b1;
        }else{
            a1/=b1;
        }
        label1.setText(String.valueOf(a1));
    }

    public void Clear(){
        label0.setText("");
        label1.setText("");
        a="";
        b="";
        a1=0;
        b1=0;
    }
}
