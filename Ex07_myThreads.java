package src.ds;

public class Ex07_myThreads extends Thread {
    private static int contador = 0;
    public static void main(String[] args) {
        System.out.println("Thread principal (main) iniciada.");

        Thread thread1 = new Thread(() -> {
            for(int i = 0; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " run: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread 1 interrompida");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i = 0; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " run: " + i);
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    System.out.println("Thread 2 interrompida");
                }
            }
        });


        thread1.start();
        thread2.start();

        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread principal (main) exxecutando " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Thread principal interrompida");
            }

        }

        System.out.println("Thread principal (main) finaizada");

        Thread thread3 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                contador++;
            }
        });

        Thread thread4 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                contador++;
            }
        });

        thread3.start();
        thread4.start();

        try {
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Valor final do contador: " + contador);
    }
}
