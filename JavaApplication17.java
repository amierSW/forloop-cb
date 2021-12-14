
package javaapplication17;

import java.util.Scanner;


public class JavaApplication17 {
    
    
    public static void main (String []args){

    Scanner a = new Scanner(System.in);
    
     
    System.out.println("ادخل  رقم التوقف"); 
    int a2=a.nextInt();
    
    
      
        System.out.println("ادخل رقم البداية");
 for( int a1=a.nextInt() ;0<a1 && a1<=100; a1++ ){
     if(a1>2&&a1<=98) {continue;}
  System.out.println(a1);
      
      if (a1== a2) {
      break;}
   
      
 }
 
    }
}   
        
   
      
        
        
        
        
        
        
