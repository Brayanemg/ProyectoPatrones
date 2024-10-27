package estrategia;

public class Squeak implements SoundBehavior {

    @Override
    public void sound() {
        System.out.println("I am squeak");
    }

    public Squeak() {
    }

    @Override
    public String toString() {
        return "Squeak{}";
    }

}
