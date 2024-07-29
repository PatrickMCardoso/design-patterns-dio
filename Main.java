import facade.*;
import singleton.*;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        // Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Facade
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DVDPlayer dvd = new DVDPlayer();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd);
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();

        // Strategy
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        cart.checkout(100);
        
        cart.setPaymentStrategy(new PaypalPayment("user@example.com"));
        cart.checkout(200);
    }
}
