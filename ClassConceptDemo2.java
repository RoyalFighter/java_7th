/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;
//creating own class
 class Box{
     private int length;
     private int breadth;
     private int height;
     //constructor iis used to set valur of instanccce variable
     //constructor public
     public Box(int length,int breadth,int height){
         this.length=length;
         this.breadth=breadth;
         this.height=height;
        
     }
      //method is function gives services
     public void displayBox(){
         System.out.println("Length: " +this.length);
          System.out.println("Breadth: " +this.breadth);
           System.out.println("Height: " +this.height);
     
     }
     public int calcVol(){
       return(this.breadth*this.height*this.length);
     }
 }
/**
 *
 * @author ASUS
 */
public class ClassConceptDemo2 {
    //psvm
    public static void main(String[] args) {
        //creating obj of box
        Box b= new Box(50,60,20);
        b.displayBox();
        int vol= b.calcVol();
        System.out.println("Volume: "+vol);
         System.out.println("Name: Robin Devkota\nRoll: 23498 7th-sem-prime");
    }
}
