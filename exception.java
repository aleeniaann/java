import java.io.*;
import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        int a=10,b=0;
        try{
            int d=a/b;
            System.out.println(d);
        }
        catch(ArithmeticException e){
            System.out.println("exception!");
        }
        finally{
            System.out.println("terminating prgm!");
        }
    }
}
