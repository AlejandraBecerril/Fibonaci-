package fibonacci;

public class Fibonacci {
     public static int fibonacci (int n){
 
         if (n<0) return n;
         else {
             return fibonacci(n) + fibonacci(n-1);
         }
     }
 
   public static void main(String[] args) {
         
         int repeticion = 100;
 
         for (int i = 1 ; i <= repeticion; i++)
         {
  
             System.out.println(i+ " :" +fibonacci);
         }
         
     }
 } 