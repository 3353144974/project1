package operation.day15.test3;

public class Paer implements Runnable {
    @Override
    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + "通过");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
