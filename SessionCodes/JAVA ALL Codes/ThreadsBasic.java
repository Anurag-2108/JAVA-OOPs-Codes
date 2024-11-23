public class ThreadsBasic {
    public static void main(String[] args) {
        System.out.println("let us find current thread");
        Thread t=Thread.currentThread();
        System.out.println("Current thread="+t);
        System.out.println("It's name="+t.getName());
        
    }
    
}
