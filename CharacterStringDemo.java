/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

import java.io.*;
//Character stream can read and write through string
//uses two class
// file reader and wwiter to read and write data

public class CharacterStringDemo {
    public static void main(String[] args) {
        
        try{
               FileWriter fw=new FileWriter("csit.txt");
               String data="helo from robin";
               fw.write(data);
               System.out.println("content written sucessfuly");
               fw.close();
               //read
               FileReader fr =new FileReader("csit.txt");
               int res;
               while ((res=fr.read())!=-1){
                   System.out.print((char)res);
                   
               }
               fr.close();
                    
        }catch(IOException i){
            System.out.println(i);}

    }
    
    
}
