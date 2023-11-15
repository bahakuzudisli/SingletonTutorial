public class Singleton {
    private volatile static Singleton uniqueInstance;
    private int number = 0;

    private Singleton() {}
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    public void display() {
        number++;
        System.out.println("number: " + number);
    }

}
