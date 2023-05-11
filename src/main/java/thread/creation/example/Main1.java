package thread.creation.example;

public class Main1 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("We are now in Thread : [" + Thread.currentThread().getName() + "]");
        });

        System.out.println("We are in Thread : [" + Thread.currentThread().getName() + "] before starting a new thread");
        thread.start();
        System.out.println("We are in Thread : [" + Thread.currentThread().getName() + "] after starting a new thread");

    }
}
