class Callme {
    synchronized void call (String msg){
        System.out.println("[");
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("interrupted");
        }
        System.out.println(msg+"]");
    }
}

class caller implements Runnable {
    String msg;
    Callme target;
    Thread t;
    public caller(Callme tar, String s){
        target=t;
        msg=s;
        t=new Thread(this);
        t.start();
    }
    public void run(){
        target.call(msg);
    }
}

public class thread_sync {
    public static void main(String args[]){
        //....
        Callme c=new Callme();
        caller c1=new caller(c, "hello");
        caller c2=new caller(c, "world");
        try {
            c1.t.join();
            c2.t.join();

        }
        catch(InterruptedException e){

        }
    }
}
