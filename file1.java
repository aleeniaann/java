import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class file1 {
    public static void main(String[] args) throws IOException {
        try {
            FileReader f=new FileReader("text.txt");
            BufferedReader b=new BufferedReader(f);
            String s;
            while((s=b.readLine())!=null){
                System.out.println(s);
                f.close();
            }
            }
            catch(FileNotFoundException e){
                System.out.println("file not found!");
            
        }    
    }
}
