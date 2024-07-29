package facade;

public class HomeTheaterFacade {
    private Amplifier amp;
    private Tuner tuner;
    private DVDPlayer dvd;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DVDPlayer dvd) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        amp.on();
        tuner.on();
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        dvd.stop();
        dvd.off();
        tuner.off();
        amp.off();
    }
}
