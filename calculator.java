import javax.swing.*;
import java.awt.*;

class calculator{
    public static void main (String args[])
    {
        JFrame myframe=new JFrame("calculator");
        myframe.setLayout(null);
        myframe.setSize(200,400);
        myframe.setVisible(true);
  
       
        Container c = myframe.getContentPane();
        c.setBackground(Color.blue);
        
          
         JButton btn0=new JButton("0");
        btn0.setBounds(10,380,110,40);
        myframe.add(btn0);
        
        JButton btn1=new JButton("1");
        btn1.setBounds(10,320,50,40);
       myframe.add(btn1);
        
       JButton btn2=new JButton("2");
        btn2.setBounds(70,320,50,40);
        myframe.add(btn2);
        
         JButton btn3=new JButton("3");
        btn3.setBounds(130,320,50,40);
        myframe.add(btn3);
        
        
         JButton btn4=new JButton("4");
        btn4.setBounds(10,260,50,40);
        myframe.add(btn4);
        
        
         JButton btn5=new JButton("5");
        btn5.setBounds(70,260,50,40);
        myframe.add(btn5);
        
         JButton btn6=new JButton("6");
        btn6.setBounds(130,260,50,40);
       myframe.add(btn6);
        
         JButton btn7=new JButton("7");
        btn7.setBounds(10,200,50,40);
        myframe.add(btn7);
        
        JButton btn8=new JButton("8");
        btn8.setBounds(70,200,50,40);
        myframe.add(btn8);
        
         JButton btn9=new JButton("9");
        btn9.setBounds(130,200,50,40);
        myframe.add(btn9);
       
        
        JButton btn10=new JButton("+");
        btn10.setBounds(190,260,50,40);
        myframe.add(btn10);
        btn10.setBackground(Color.yellow);
           
         JButton btn11=new JButton(".");
        btn11.setBounds(130,380,50,40);
        myframe.add(btn11);
       
       JButton btn12=new JButton("=");
       btn12.setBounds(190,320,50,100);
       myframe.add(btn12);
       btn12.setBackground(Color.yellow);
        
       JButton btn13=new JButton("x");
       btn13.setBounds(190,200,50,40);
       myframe.add(btn13);
       btn13.setBackground(Color.yellow);
         
       JButton btn14=new JButton("^");
        btn14.setBounds(10,140,50,40);
        myframe.add(btn14);
        
        JButton btn15=new JButton("x^2");
        btn15.setBounds(70,140,50,40);
        myframe.add(btn15);
        
        JButton btn16=new JButton("1/x");
        btn16.setBounds(130,140,50,40);
        myframe.add(btn16);
        
        
        JButton btn17=new JButton("-");
        btn17.setBounds(190,140,50,40);
        myframe.add(btn17);
        btn17.setBackground(Color.yellow);
          
        JButton btn18=new JButton("/");
        btn18.setBounds(190,80,50,40);
        myframe.add(btn18);
        btn18.setBackground(Color.yellow);
       
        JButton btn19=new JButton(" DELETE ");
        btn19.setBounds(130,80,50,40);
        myframe.add(btn19);
        btn19.setBackground(Color.red);
         
        JButton btn20=new JButton("C");
        btn20.setBounds(70,80,50,40);
        myframe.add(btn20);
         btn20.setBackground(Color.red);
        
        
        JRadioButton radio=new JRadioButton("0ff");
        radio.setBounds(10,100,50,30);
        myframe.add(radio);
        JRadioButton radio1=new JRadioButton("on");
        radio1.setBounds(10,80,50,30);
        myframe.add(radio1);
        
        
        JTextField text=new  JTextField();
        text.setBounds(10,20,240,40);
        myframe.add(text);
        
        
          
    }
}
        
    