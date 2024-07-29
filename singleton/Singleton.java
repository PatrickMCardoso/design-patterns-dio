package singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Construtor privado para evitar instâncias múltiplas
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
