package Lecture_1;
public class Main{

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("We are in thread: "+Thread.currentThread().getName());
                System.out.println("Current thread priority: "+Thread.currentThread().getPriority());
            }
            
        });

        thread.setName("New Worker Thread");
        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("We are in thread before start: "+Thread.currentThread().getName());
        thread.start();
        System.out.println("We are in thread after start: "+Thread.currentThread().getName());
        Thread.sleep(10000);
    }
}