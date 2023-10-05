/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

//using multithreading a program can do multiple task at a same time
// implementing runable interface
//Inheritace(extents) thread class

class Calculation3 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=50;i++){
            System.out.println("calculation3:"+i);
            try{
                Thread.sleep(1000);       
            }catch(InterruptedException j){
           System.out.println(j); 
        }
        }
    }
}
class Calculation4 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=50;i++){
            if(i%2==0){
                System.out.println("calculaton4"+i);
                try{
                    Thread.sleep(500);
                }catch(InterruptedException j){
                    System.out.println(j);
                }
            }
        }
    }
}
public class ThreadDemo1 {
    
    public static void main(String[] args) {
        Calculation3 c3= new Calculation3();
          Calculation4 c4= new Calculation4();
          c3.start();
          c4.start();
        
    }
    
    
}
