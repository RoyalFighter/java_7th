/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;
import java.io.*;

//stram is a sequence of data in java input output is dont through stram 
//Byte Stram:read and write data through sequenccceo of byte two classes are used
//files input stream:to read data into file through byte stream;
//files output stream:to write data into file through byte stream;

public class ByteStreamDemo {
    public static void main(String[] args) {
        try{
            FileOutputStream fos=new FileOutputStream("csit.txt");
            String data ="iam from 7th sem";
            byte []b1= data.getBytes();
            fos.write(b1);
            System.out.println("Written sucessfully");
            // reading dara from file using byte stream
            FileInputStream fis =new FileInputStream("csit.txt");
            int res;
            while((res=fis.read())!=-1){
            System.out.print((char)res);
            }
            
        }catch(IOException i){
            System.out.println(i);
        }
    }
    
}
