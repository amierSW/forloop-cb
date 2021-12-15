
package javaapplication17;

import java.util.ArrayList;
public class JavaApplication17 {
    
    
    public static void main (String []args){

        
        
        
    ArrayList<Integer> marks = new ArrayList();    
 marks.add(1);
 marks.add(2);
 marks.add(3);
 marks.add(4);
 marks.set(1,20);//(20)تغيير ثاني قيمةب 
 marks.remove(3);//حذف رابع قيمة
 
                System.out.println(marks);
                System.out.println("اول قيمة في الارري ليست: "+marks.get(0));
                System.out.println("ثاني قيمة في الارري ليست: "+marks.get(1));
                System.out.println("حجم الأرري ليست: "+marks.size()  );

      
        
        
        
     
    }
}   
        
   
      
        
        
        
        
        
        
