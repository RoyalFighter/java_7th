/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

//decleraed using abstract keyword and its object cannot be created
//it can have instance variable consturctor,method and abstract method
//abstraact method are such which do not have implementation part 
//such normal class should provide body part of abstract methods

abstract class Calcs{
    
    //instance variable
    private int x;
    private  int y;
    //constructor
    public Calcs (int x ,int y)
    {
        this.x=x;
        this.y=y;
    }
    //normal method
    public void add(){
        System.out.println("Addition is :"+(this.x+this.y));
    }
    //abstract method
    public abstract void substract(int x1,int y1);
    public abstract int multiple(int x1,int y1);
}
class Sols extends Calcs{
    private int x2;
    private int y2;
    public Sols(int x2,int y2, int x,int y){
    super(x,y);
        this.x2 = x2;
        this.y2 = y2;
    }
    //normal method
    public void division(){
        System.out.println("Division is: "+(this.x2/this.y2));
    
    }
    //overrsiding abstract method :providing detail of abstracct method
    @Override
    public void substract(int x1,int y1){
        System.out.println("Substraccction is :" +(x1-y1));
    }
     @Override
     public int multiple(int x1, int y1){
         return(x1*y1);
     
     }
    

}

public class AbstractclassDemo {
    
    public static void main(String[] args) {
        // Calcs c1 =new Calcs ();
        // Calcs is abstract class
        Sols s1=new Sols(5,10,15,20);
        s1.add();
        s1.division();
        s1.substract(10,5);
        int mul=s1.multiple(10, 20);
        System.out.println("Multiplication is:"+mul);
        Calcs c1;
        c1=s1;//dynamic method dispatch
        c1.add();
        int mul2=c1.multiple(100,200);
        System.out.println("Multiplication is :"+mul2);
        c1.substract(100,200);
        
    }
}
