/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

/**
 *
 * @author ASUS
 */
class Person{
private String name;
private String gender;
private String phone;

public Person(String name,String gender,String phone){
    this.name=name;
    this.gender=gender;
    this.phone=phone;

}
void displayPerson(){
    System.out.println("Name is:"+this.name);
    System.out.println("Gender is:"+this.gender);
    System.out.println("Phone is:"+this.phone);
}
}

class Student extends Person{
    private int roll;
    private String faculty;
    private String grade;
    
    //constructor
    public Student(int roll,String faculty,String grade,String name,String gender,String phone){
    super(name,gender,phone);
    this.roll=roll;
    this.faculty=faculty;
    this.grade=grade;
    }
    void displayStudent(){
    System.out.println("Roll is:"+this.roll);
    System.out.println("Faculty is:"+this.faculty);
    System.out.println("Grade is:"+this.grade);
}

}
public class InheritanceDemo {
    public static void main(String[] args) {
        Student s=new Student(1,"csit","A","Robin","Male","9813");
        s.displayPerson();
        s.displayStudent();
        System.out.println("Name: Robin Devkota\nRoll: 23498 7th-sem-prime");
    
    }
    
    
}
