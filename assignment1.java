/*Write a Java program to create a new file named ‘MyFile.txt’ and write the
statement “This is the University Exam for OODP. This a program to illustrate
the use of files.” into the file with each sentence in the statement representing a
new line in the file.*/

import java.io.*;
import java.io.File;
import java.util.*;

public class assignment1
{
    public static void main(String[] args){
        // File f=new File(\\Users\\sumi\\Desktop\\java\\);

        // File f=new File("C:\\Users\\sumi\\Desktop\\java\\MyFile.txt");
        // File.createNewFile();
        File f=new File("MyFile.txt");
        try{
            boolean result;
            f.createNewFile("MyFile.txt");
            if(result){
                System.out.println("file created successfully");
            }
            else{
                System.out.println("File exists");
            }
        
       // BufferedInputStream ip= new BufferedInputStream(in);
    //    FileReader fr= new FileReader(input.txt);
    //    BufferedReader br= new BufferedReader(fr);
       FileWriter fw=new FileWriter(MyFile.txt);

       try{
        String str= "This is the University Exam for OODP. This a program to illustrate the use of files.";
        if(str=="."){
        fw.write.nextLine(str);
        }
       
       catch(FileNotFoundException e){
           System.out.print("File Not Found!");
       }
    }
       catch(IOException ee){
          // System.out.println
       }
    }
    }
}

/*import java.io.*;
import java.util.Scanner;

public class CreatingFile {
        
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
}*/