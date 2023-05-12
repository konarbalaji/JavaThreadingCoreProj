package thread.creation.example;

public class Main1 {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            System.out.println("We are now in Thread : [" + Thread.currentThread().getName() + "]");
            System.out.println("PRIORITY : " + Thread.currentThread().getPriority());
            throw new RuntimeException("Intentional error");
        });

        thread.setName("New Worker Thread");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("A critical error happened in thread : [" + t.getName() + "] . The error is : " + e.getMessage());
            }
        });

        System.out.println("We are in Thread : [" + Thread.currentThread().getName() + "] before starting a new thread");
        thread.start();
        System.out.println("We are in Thread : [" + Thread.currentThread().getName() + "] after starting a new thread");

    }
}