import java.util.concurrent.Semaphore;
public class Main {
    static  Semaphore s1 = new Semaphore(1);
   static Semaphore s2 = new Semaphore(0);
   static Semaphore s3 = new Semaphore(0);
    public static void main(String[] args) {
      
        ThreadCode t1 = new Thread_code("a",s1,s2);
        ThreadCode t2 = new Thread_code("b",s2,s3);
        ThreadCode t3 = new Thread_code("c",s3,s1);
        
        t1.start();
        t2.start();
        t3.start();
    }
    
}
