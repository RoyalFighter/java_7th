/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

//it is like abstract class but difference  is that it only consist 
//list of abastract method,it doesnot have normal method,constructor
//if instance variable is declared it will be be final (constant) by default
//it is decleared using interface keyword and cannot be insrantiated.

interface Calcs1{
void add(int x,int y);
void diff(int x,int y);
 int mul(int x,int y);

}
class Sols1 implements Calcs1{
    @Override
public void add(int x,int y){
    System.out.println("Addition is:" +(x+y));
}
  @Override
public void diff(int x,int y){
    System.out.println("Sub is:" +(x-y));
}
  @Override
public int  mul(int x,int y){
    return(x*y);
}

}


public class InterfaceDemo {
    public static void main(String[] args) {
        Sols1 s1=new Sols1();
        s1.add(10,10);
        s1.diff(20,10);
        int mul1=s1.mul(20, 8);
        System.out.println("Mul is"+mul1);
        Calcs1 c1;
        c1=s1;
        c1.add(10,20);
        c1.diff(20, 30);
        int mul2=s1.mul(20, 8);
        System.out.println("Mul is"+mul2);
        
        
        
    }
}
