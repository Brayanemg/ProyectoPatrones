package estrategia;

public class Quack implements SoundBehavior {

    @Override
    public void sound() {
        System.out.println("I am quacking");
    }

    public Quack() {
    }

    @Override
    public String toString() {
        return "Quack{}";
    }

}
