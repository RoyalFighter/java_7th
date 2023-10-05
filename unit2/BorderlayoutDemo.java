/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit2;
//divide the window into 5 parts:East west north and south
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Border extends JFrame{
        JButton b1,b2,b3,b4;
        JTextArea t1;
        public void setBorder(){
     b1=new JButton("Button1:");
       b2=new JButton("Button2");
       b3=new JButton("Button3");
       b4=new JButton("Button4");
       t1=new JTextArea(10,10);
       setVisible(true);
       setSize(400,400);
       setLayout(new BorderLayout());
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    //adding componetn in frame using set layout
    add(b1,BorderLayout.NORTH);//top
    add(b2,BorderLayout.EAST);//right
    add(b3,BorderLayout.SOUTH);//buttom
    add(b4,BorderLayout.WEST);//left
    add(t1,BorderLayout.CENTER);//center
    b1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            t1.setText("North Buttton is Clicked\n");
            

        }
    });
     b2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            t1.setText("East Buttton is Clicked\n");
            

        }
    });
      b3.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            t1.setText("South Buttton is Clicked\n");
            

        }
    });
       b4.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            t1.setText("West Buttton is Clicked\n");
            

        }
    });
        
        }
}

public class BorderlayoutDemo {
    public static void main(String[] args) {
        Border b1=new Border();
        b1.setBorder();
    }
}
