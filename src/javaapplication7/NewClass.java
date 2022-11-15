package javaapplication7;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            int num = s.nextInt();
            int sum =0;
            int temp = num;
            
            while(temp != 0){
                int r = temp %10;
                sum = sum + r*r*r;
                temp = temp/10;
            }
            
          if (num == sum) {
            System.out.println("armstrong number");
        }else{
               System.out.println("not armstrong number");
        
            
        }
     
        
        
    }

   


    

}
