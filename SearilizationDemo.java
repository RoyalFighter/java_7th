/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

 import java.io.*;
         //process of writing object to the file
//decserilazation is process of reading object from file
//classes used;
//objectOutputStream to write object
//objectInputStream to Read object

class Rectangle implements Serializable{
private int len;
private int bre;
public Rectangle (int len,int bre){
this.len=len;
this.bre=bre;
}
public void calcArea(){
    System.out.println("Area is :"+(this.len*this.bre));
}
public void perimeter(){
    System.out.println("Perimeter is:"+(2*(this.len+this.bre)));
}
}
    

public class SearilizationDemo {
    public static void main(String[] args) {
        try{
            Rectangle r1=new Rectangle(30,30);
            //opening file
            FileOutputStream fos= new  FileOutputStream("csit.txt");
            ObjectOutputStream oos =new  ObjectOutputStream(fos);
            oos.writeObject(r1);//writing object to file
            System.out.println("object Written sucessfully");
            fos.close();
            oos.close();
            //deserilization
            FileInputStream fis =new FileInputStream("csit.txt");
            ObjectInputStream ois =new ObjectInputStream(fis);
            Rectangle r2=(Rectangle)ois.readObject();
            r2.calcArea();
            r2.perimeter();
            fis.close();
            ois.close();
            
            
        }catch(IOException i){
            System.out.println("i");
        }catch(ClassNotFoundException c){
            System.out.println(c);
        }
        
    }
    
}
