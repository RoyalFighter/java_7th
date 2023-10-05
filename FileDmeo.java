/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;
import java.io.*;

/**
 *
 * @author ASUS
 */
public class FileDmeo {
    public static void main(String[] args) {
        //creatiing file
        try{
            File f1=new File("csit.txt");
            if(!f1.exists()){
            f1.createNewFile();
            }
            else{
                System.out.println("Already exists");
            }
            //mehods
            System.out.println("Name of FIle" +f1.getName());
            System.out.println("Path:" +f1.getPath());
            System.out.println("A path is:" +f1.getAbsolutePath());
            System.out.println("Size of file :"+f1.getTotalSpace());
        
        
    }
    catch(IOException i){
            System.out.println("i");
}
    
    }
    }
