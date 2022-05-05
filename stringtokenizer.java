import java.util.Scanner;
import java.util.*;
import java.io.*;

public class stringtokenizer {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter digits  ");
        String digit=s.nextLine();
        StringTokenizer token=new StringTokenizer(digit);
        int dig=0,sum=0;
        System.out.println("digits are ");
        while(token.hasMoreTokens()){
            String sc=token.nextToken();
            dig=Integer.parseInt(sc);
            System.out.println(dig+" ");
            sum+=dig;
        }
        System.out.println("\n");
        System.out.println("sum= "+sum);
    }
}