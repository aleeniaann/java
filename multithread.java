import java.io.*;
//import java.util.random;
import java.util.Random;

class EvenThread extends Thread{
    int e;
    EvenThread(int v){
        e=v;
        start();
    }
    public void run(){
        System.out.println("from even: "+(e*e));
    }
}

class OddThread extends Thread{
    int o;
    OddThread(int v){
        o=v;
        start();
    }
    public void run(){
        System.out.println("from odd"+(o*o*o));
    }
}

class RThread extends Thread {
    RThread(){
        start();
    }
    public void run(){
        Random r=new Random();
        for(int i=0;i<5;i++)
        {
            int x=r.nextInt();
            if(x%2==0){
            EvenThread e=new EvenThread(x);
            }
            else{
            OddThread o=new OddThread(x);
            }
        }
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){

        }
    }
}

public class multithread {
    public static void main(String[] args) {
        RThread r=new RThread();
    }
}
