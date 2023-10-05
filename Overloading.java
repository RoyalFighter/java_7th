/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

/**
 *
 * @author ASUS
 */
class Calculation {
    public void calc() {
        System.out.println("hello from Robin I am learning method overloading");
    }

    public void calc(int x, int y) {
        System.out.println(x + y);
    }

    public void calc(double x, double y) {
        System.out.println(x * y);
    }

    public void calc(int x, int y, int z) {
        System.out.println((x * y) + z);
    }
}


public class Overloading {
    public static void main(String[] args) {
        Calculation c1 = new Calculation();

        // calls calc with no parameters
        c1.calc();

        // calls calc with two int parameters
        c1.calc(33, 36);

        // calls calc with two double parameters
        c1.calc(3.3, 3.6);

        // calls calc with three parameters
        c1.calc(33, 2, 3);
        System.out.println("Name: Robin Devkota\nRoll: 23498 7th-sem-prime");
    
    }
}
