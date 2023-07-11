import java.util.concurrent.Semaphore;
class ThreadCode extends Thread{
    public String c;
     public  Semaphore s1 , s2;
   public ThreadCode(String c , Semaphore s1, Semaphore s2){
     this.c = c;
     this.s1 = s1;
     this.s2 = s2;
     }
    
   public void run(){
       try{
           while(true){
               s1.acquire();
             System.out.println(this.c);
               s2.release();
               Thread.sleep(3000);
             }
       }
       catch(Exception e){
           e.printStackTrace();
       }
   
     }



}
