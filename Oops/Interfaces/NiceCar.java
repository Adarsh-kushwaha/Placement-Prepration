package Oops.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media mediaPlayer;

    public NiceCar() {
        engine = new PowerEngine();
        mediaPlayer = new MediaPlayer();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void acc() {
        engine.acc();
    }

    public void startMusic() {
        mediaPlayer.start();
    }

    public void stopMusic() {
        mediaPlayer.stop();
    }
}
