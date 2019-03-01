package exceptions;

import java.io.IOException;
import java.io.PrintStream;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exceptions {
    //1-A
    public static void number(int num){
        if(num>100){
            try {
            throw new ExceptionB();
            } catch (ExceptionA ex) {
                System.out.println(" Error the number should not be over 100, caught by ExceptionA");
            }
        }
        if(num>200){
            try {
            throw new ExceptionC();
            } catch (ExceptionA ex) {
                System.out.println(" Error the number should not be over 200, caught by ExceptionA");
            }
        }
    }
    public static void someMethod()throws Exception{
        try{
       someMethod2();
        }catch(Exception e){
         throw new Exception();
        }
    }
      public static void someMethod2() throws Exception{
         throw new Exception();
    }
    public static void main(String[] args) {
       number(220);
       //1-B
    try{
          throw new ExceptionA(); 
       }catch(Exception e){
           System.out.println("Error Exception of type A caught by Exception");
       }
    try{
           throw new ExceptionB();  
       }catch(Exception e){
           System.out.println("Error Exception of type B caught by Exception");
       }
    try{
           throw new NullPointerException();  
       }catch(Exception e){
           System.out.println("Error Exception of type NullPointerException caught by Exception");
       }
    try{
           throw new IOException();  
       }catch(Exception e){
           System.out.println("Error Exception of type IOException caught by Exception");   
       }
    //2
        try {
            someMethod();
        } catch (Exception ex) {
            System.out.println(" catch the rethrown excption :)");
            ex.printStackTrace();
        }
   
    }
    
}
