import java.awt.event.*;
public class CalculatorImplementation extends InterfaceDesign implements Calculator, ActionListener 
{
       float num1,num2,result;
    int operation;
    CalculatorImplementation(){
    prepareGUI();
    
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn0.addActionListener(this);     
        btnPoint.addActionListener(this);
        btnEqual.addActionListener(this);
        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);
    }
    
      @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
        tf.setText(tf.getText()+"1");
        }
        else if(e.getSource()==btn2){
        tf.setText(tf.getText()+"2");
        }
        else if(e.getSource()==btn3){
        tf.setText(tf.getText()+"3");
        }
        
        else if(e.getSource()==btn4){
        tf.setText(tf.getText()+"4");
        }
        
        else if(e.getSource()==btn5){
        tf.setText(tf.getText()+"5");
        }
        
        else if(e.getSource()==btn6){
        tf.setText(tf.getText()+"6");
        }
        
        else if(e.getSource()==btn7){
        tf.setText(tf.getText()+"7");
        }
        
        else if(e.getSource()==btn8){
        tf.setText(tf.getText()+"8");
        }
        
        else if(e.getSource()==btn9){
        tf.setText(tf.getText()+"9");
        }
        
        else if(e.getSource()==btn0){
        tf.setText(tf.getText()+"0");
        }
        
        else if(e.getSource()==btnPoint){
        tf.setText(tf.getText()+".");
        }
        
        
        
      
        if(e.getSource()==btnPlus){
        num1=Float.valueOf(tf.getText());
        tf.setText("");
        operation=1;
        }
        else if(e.getSource()==btnMinus){
            num1=Float.valueOf(tf.getText());
        tf.setText("");
        operation=2;
        }
        else if(e.getSource()==btnMultiply){
            num1=Float.valueOf(tf.getText());
        tf.setText("");
        operation=3;
        }
        else if(e.getSource()==btnDivide){
        num1=Float.valueOf(tf.getText());
        tf.setText("");
        operation=4;
        }
        
        
          if(e.getSource()==btnEqual){
        num2=Float.valueOf(tf.getText());
            switch(operation){
            case 1:
                result= add(num1,num2);
                tf.setText(String.valueOf(result));
                break;
            case 2:
                 result= subtract(num1,num2);
                tf.setText(String.valueOf(result));
                break;
            case 3:
                 result= multiply(num1,num2);
                tf.setText(String.valueOf(result));
                break;
            case 4:
                 result= divide(num1,num2);
                tf.setText(String.valueOf(result));
                break;
            }
        }
        
        
        
        

    }
    
      public  int add(int num1, int num2){
            return num1+num2;
        }
       
      public int subtract(int num1, int num2){
            return num1-num2;
        }
       
      public int multiply(int num1, int num2){
            return num1*num2;
        }
        
      public int divide(int num1, int num2){
            return num1/num2;
        }
        
     public  float add(float num1, float num2){
            return num1+num2;
        }
       
      public  float subtract(float num1, float num2)
      {
             return num1-num2;
        }
        public float divide(float num1, float num2){
             return num1/num2;
        }
        public float multiply(float num1, float num2){
         return num1*num2;
        }
       
       
       
    
}
