
package unit2;
import javax.swing.*;
import java.awt.*;

class PopUp extends JFrame{
    public void setPopUp(){
JPopupMenu p1=new JPopupMenu();

JMenuItem i1=new JMenuItem("Open");

JMenuItem i2=new JMenuItem("Save");

JMenuItem i3=new JMenuItem("Exit");
p1.add(i1);
p1.add(i2);
p1.add(i3);
add(p1);

setVisible(true);

setSize(300,300);

setLayout(new FlowLayout());

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
p1.show(this,150,150);

    }
}
public class PopupMenuDemo {
    public static void main(String[] args) {
        PopUp p=new PopUp();
        p.setPopUp();
        
    }
    
}
