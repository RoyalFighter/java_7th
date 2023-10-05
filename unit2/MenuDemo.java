// menu bar is the taab that contain sequnce of item know as menu
//menu congtain collectionof item kknown as menu item

package Unit2;
//menu bar is a tab that contains sequenec of item known as menu 
//menu contain collection of item known as menu item
import javax.swing.*;
import java.awt.*;
class Menu extends JFrame{
    public void setMenu(){
        //creating menu bar
        JMenuBar mb= new JMenuBar();
        //creating first menu 
        JMenu m1= new JMenu("File");
    //adding newmonic for shortcut key
          m1.setMnemonic('f');

        //creating menu item for first menu 
        JMenuItem i1= new JMenuItem("Open");

        JMenuItem i2= new JMenuItem("save");
        JMenuItem i3= new JMenuItem("saves");
        //adding item on menu 1 
        m1.add(i1);m1.add(i2);m1.add(i3);
        //adding menu on menu bar
        mb.add(m1);
        //adding branching: addmin sub compoenent on particulat menu item 
        JMenu m2= new JMenu("New");
        JMenuItem i4= new JMenuItem("i4");
        JMenuItem i5= new JMenuItem("i5");
        JMenuItem i6= new JMenuItem("i6");
        m2.add(i4);m2.add(i5);m2.add(i6);
        m1.add(m2);
        //checkboxmenu item: can be set on and off 
        JMenu m3= new JMenu("Edit");
        JCheckBoxMenuItem c1 = new JCheckBoxMenuItem("Copy");
        JCheckBoxMenuItem c2 = new JCheckBoxMenuItem("Paste");
        JCheckBoxMenuItem c3 = new JCheckBoxMenuItem("Cut");
        m3.add(c1);m3.add(c2);m3.add(c3);
        mb.add(m3);
        //RadioButtonMenuItem
        JMenu m4= new JMenu("View");
        JRadioButtonMenuItem r1= new JRadioButtonMenuItem("zoom");
        JRadioButtonMenuItem r2= new JRadioButtonMenuItem("status bar");
        m4.add(r1);m4.add(r2);
        mb.add(m4);
        add(mb);//adding menu bar on JFrame 
        setVisible(true);
        setSize(300,300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

public class MenuDemo {
    public static void main(String[] args) {
        Menu m=new Menu();
        m.setMenu();
        
    }
    
}
