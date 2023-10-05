/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

  class UserInput extends JFrame{
    JLabel  l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2,b3;
    public void setInput(){
        l1=new JLabel("Enter first number");
        l2=new JLabel("Enter Second number");
        l3=new JLabel("Result");
        t1=new JTextField(20);
        t2=new JTextField(20);
        b1=new JButton("sum");
        b2=new JButton("Multiply");
        b3=new JButton("Divide");
        //adding componetn in window
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(l3);
        //adding window specification
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //adding event handling
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int c=a+b;
                l3.setText("Sum is "+c);
            }
        });
        //for multiply
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int c=a*b;
                l3.setText("Multiplication is "+c);
            }
        });
        // Divide
         b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int c=a/b;
                l3.setText("Divison  is "+c);
            }
        });

    }
  }
public class UserInputDemo {
    public static void main(String[] args) {
         UserInput u=new UserInput();
        u.setInput();
    }
    
       
    
}
