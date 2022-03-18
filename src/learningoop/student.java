/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learningoop;

/**
 *
 * @author mritunjay
 */
import java.util.Scanner;
public class student {
    Scanner sc=new Scanner(System.in);
    String name="";
    int RollNo=0;
    
    public void get_Details(){
        System.out.println("Enetr the name");
        name=sc.next();
        System.out.println("");
        System.out.println("Enetr the roll no:");
        RollNo=sc.nextInt();
    }
    public void show_Details(){
        System.out.print("The name is:"+" "+name);
        System.out.print("The roll is:"+" "+RollNo);
        
    }
    
}