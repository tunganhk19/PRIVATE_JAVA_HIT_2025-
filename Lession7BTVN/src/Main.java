import java.util.Random;

class BrokenCarException extends Exception {
    public BrokenCarException(String message) {
        super(message);
    }
}

class Car implements Runnable {
    private String name;
    private double speed;
    private Random random = new Random();

    public Car(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void run() {
        for (int km = 1; km <= 30; km++) {
            try {
                if (random.nextInt(99) < 10) {
                    throw new BrokenCarException("Xe " + name + " bị nổ lốp!");
                }
                long sleepTime = 100 + (long)(random.nextDouble() * (speed - 100));
                Thread.sleep(sleepTime);
                System.out.println("Xe " + name + ": Đã chạy được " + km + " km.");

            } catch (BrokenCarException e) {
                System.out.println(e.getMessage());
                return;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Xe " + name + " đã hoàn thành đường đua!");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Ferrari", 500);
        Car car2 = new Car("Lamborghini", 400);
        Car car3 = new Car("Porsche", 450);

        Thread t1 = new Thread(car1);
        Thread t2 = new Thread(car2);
        Thread t3 = new Thread(car3);

        t1.start();
        t2.start();
        t3.start();
    }
}
