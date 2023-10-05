/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit1;
//using runnable interface
class Calculation5 implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=50;i++){
            if(i%2==0){
                System.out.println("calculaton5"+i);
                try{
                    Thread.sleep(500);
                }catch(InterruptedException j){
                    System.out.println(j);
                }
            }
        }
    }
}
class Calculation6 implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=50;i++){
                System.out.println("calculaton6"+i);
                try{
                    Thread.sleep(500);
                }catch(InterruptedException j){
                    System.out.println(j);
                }
            
        }
    }
}
public class ThreadDemo2 {
    public static void main(String[] args){
        Calculation5 c5 = new Calculation5();
        Calculation6 c6 = new Calculation6();
        Thread t1= new Thread(c5);
        Thread t2= new Thread(c6);
        t1.start();
        t2.start();
    }
    
}
