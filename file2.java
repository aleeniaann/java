 //reads frm a file and write to file by handling all file related exceptions
import java.util.*;
import java.io.*;

public class file2 {
    public static void main(String[] args) {
        // FileReader f=new FileReader("text.txt");
        // BufferedReader b= new BufferedReader(f);
        FileInputStream f1=null;
        FileOutputStream f2=null;

        try {
            f1=new FileInputStream("text.txt");
            f2= new FileOutputStream("sample.txt");
            
        }
    }
}
