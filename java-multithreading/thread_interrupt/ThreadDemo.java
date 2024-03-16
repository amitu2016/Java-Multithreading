package thread_interrupt;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new BlockingTask());
        thread.start();
        //To stop the thread execution
        thread.interrupt();
    }
    
}


class BlockingTask implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(500000);
        } catch (InterruptedException e) {
            System.out.println("Exiting the blocking thread");
        }
    }
    
}
