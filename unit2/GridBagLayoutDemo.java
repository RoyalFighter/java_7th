// Purpose: To demonstrate the use of GridBagLayout
//afno way ma content halna para we use grid bag layout
//to specify the content 
package unit2;
import javax.swing.*;
import java.awt.*;


class GridBag extends  JFrame{
    JButton b1,b2,b3,b4,b5,b6;
    public void setGridBag(){
        b1=new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");
        b4=new JButton("Button4");
        b5=new JButton("Button5");
        b6=new JButton("Button6");
       
        //adding grid bag layout
        GridBagLayout gb1= new GridBagLayout();
        //adding grid bag constraint
       
        
     
        setVisible(true);
          setSize(500,500);
        setSize(500,500);
        setLayout(gb1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
         GridBagConstraints gbc1=new GridBagConstraints();
        //adiing b1 in coordinate in 0,0

        gbc1.gridx=0;
        gbc1.gridy=0;
        gbc1.fill=GridBagConstraints.HORIZONTAL;
        add(b1,gbc1);
        gbc1.gridx=1;
        gbc1.gridy=1;
         gbc1.fill=GridBagConstraints.HORIZONTAL;
        add(b2,gbc1);
        //adding b3 on coordinate 1,0 with allcoating 2 ceels
        gbc1.gridx=2;
        gbc1.gridy=2;
//        gbc1.gridwidth=2;
         gbc1.fill=GridBagConstraints.HORIZONTAL;
        add(b3,gbc1);
        
        gbc1.gridx=3;
        gbc1.gridy=3;
//              gbc1.gridwidth=2;
        gbc1.fill=GridBagConstraints.HORIZONTAL;
        add(b4,gbc1);
        gbc1.gridx=4;
        gbc1.gridy=4;
         gbc1.fill=GridBagConstraints.HORIZONTAL;
        add(b5,gbc1);
        gbc1.gridx=5;
        gbc1.gridy=5;
         gbc1.fill=GridBagConstraints.HORIZONTAL;
        add(b5,gbc1);
         gbc1.gridx=6;
        gbc1.gridy=6;
         gbc1.fill=GridBagConstraints.HORIZONTAL;
        add(b5,gbc1);
         gbc1.gridx=6;
        gbc1.gridy=6;
        gbc1.fill=GridBagConstraints.HORIZONTAL;
        add(b5,gbc1);
        
        gbc1.gridx=7;
        gbc1.gridy=7;
        gbc1.gridwidth=2;
        gbc1.fill=GridBagConstraints.HORIZONTAL;
        add(b6,gbc1);
         gbc1.gridwidth=2;
       
    }
}

public class GridBagLayoutDemo {
    public static void main(String[] args) {
        GridBag g1=new GridBag();
        g1.setGridBag();
    }

    
}
