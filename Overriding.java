/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

/**
 *
 * @author ASUS
 */

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.\nIam being called from SuperClass");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("The dog barks.\nIam being called from SubClass");
    }
}
public class Overriding {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.makeSound();    // Output: The dog barks.
        System.out.println("Name: Robin Devkota\nRoll: 23498 7th-sem-prime");
    }
    
    
}
