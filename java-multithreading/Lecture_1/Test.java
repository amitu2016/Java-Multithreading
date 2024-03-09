package Lecture_1;
import java.lang.Thread.UncaughtExceptionHandler;

public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                throw new RuntimeException("Intentional Exception");
            }
            
        });

        thread.setName("Misbehaving Thread");

        thread.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {

            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("A Critical Exception Occoured in thread "+ t.getName()
                +" The error is "+e.getMessage());
            }
            
        });

        thread.start();

    }
}
