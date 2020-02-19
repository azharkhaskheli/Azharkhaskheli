import javax.swing.*;
import java.awt.event.*;
public class InterfaceDesign extends JFrame 
{
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnPoint,btnEqual,btnPlus,btnMinus,btnMultiply,btnDivide;
    JTextField tf;

    public InterfaceDesign(){
        this.setTitle("Calculator");
        this.setBounds(1,1,300,340);
        this.setVisible(true);
        this.setLayout(null);
        
         
        
         tf=new JTextField();
        btn1=new JButton("1");
        btn2=new JButton("2");
        btn3=new JButton("3");
        btn4=new JButton("4");
        btn5=new JButton("5");
        btn6=new JButton("6");
        btn7=new JButton("7");
        btn8=new JButton("8");
        btn9=new JButton("9");
        btn0=new JButton("0");        
        btnPoint=new JButton(".");
        btnEqual=new JButton("=");
        btnPlus=new JButton("+");
        btnMinus=new JButton("-");
        btnMultiply=new JButton("X");
        btnDivide=new JButton("/");
        
          
        
        
    }
    
    public void prepareGUI(){
     
        btn0.setBounds(10,240,50,50);        
        btnPoint.setBounds(70,240,50,50);
        btnEqual.setBounds(130,240,50,50);
        
        btn1.setBounds(10,180,50,50);
        btn2.setBounds(70,180,50,50);
        btn3.setBounds(130,180,50,50);
        
        btn4.setBounds(10,120,50,50);
        btn5.setBounds(70,120,50,50);
        btn6.setBounds(130,120,50,50);
        
        btn7.setBounds(10,60,50,50);
        btn8.setBounds(70,60,50,50);
        btn9.setBounds(130,60,50,50);
     
        btnPlus.setBounds(190,60,80,50);
        btnMinus.setBounds(190,120,80,50);
        btnMultiply.setBounds(190,180,80,50);
        btnDivide.setBounds(190,240,80,50);
        
        tf.setBounds(10,10,260,40);
        
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add( btn4);
        this.add(btn5);
        this.add(btn6);
        this.add(btn7);
        this.add(btn8);
        this.add(btn9);
        this.add(btn0);        
        this.add(btnPoint);
        this.add(btnEqual);
        this.add(btnPlus);
        this.add(btnMinus);
        this.add(btnMultiply);
        this.add(btnDivide);
        this.add(tf);
        
        
        
    }
    
    
    
}
