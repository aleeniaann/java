/*import java.io.*;
import java.util.Scanner;


public class test1 {
        
    public static void main(String[] args) throws Exception{
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String name = sc.nextLine();
        FileOutputStream fo = new FileOutputStream(name, true);
        System.out.println("Enter the content: ");
        String str=sc.nextLine()+"\n";
        byte [] b = str.getBytes();
        fo.write(b);
        fo.close();
    }
}*/
import java.io.*;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) throws Exception{
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String name = sc.nextLine();
        FileOutputStream fo = new FileOutputStream(name, true);
        System.out.println("Enter the content: ");
        String str=sc.nextLine()+"\n";
        char [] r = str.toCharArray();
        for( int i=0; i < r.length; i++){
            if(str.charAt(i) == '.'){
                r[i] = '\n';
            }
        }
        str = String.valueOf(r);
        byte [] b = str.getBytes();
        fo.write(b);
        fo.close();
    }
}

/* import java.io.*;
import java.util.Scanner;


public class Main {
        
    public static void main(String[] args) throws Exception{
       // FileOutputStream f1;
        // String s;
     
           FileOutputStream fo=new FileOutputStream("MyFile.txt");
            String str="This is the university exam for OOPD.This program to illustrate the use of  file.";
        
        char [] r = str.toCharArray();
        for( int i=0; i < r.length; i++){
            if(str.charAt(i) == '.'){
                r[i] = '\n';
            }
        }
        str = String.valueOf(r);
        byte [] b = str.getBytes();
        fo.write(b);
        fo.close();
    }
}
*/