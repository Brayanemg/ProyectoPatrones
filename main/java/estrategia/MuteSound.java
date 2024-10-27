package estrategia;

public class MuteSound implements SoundBehavior {

    @Override
    public void sound() {
        System.out.println("I cannot make sound");
    }

    public MuteSound() {
    }

    @Override
    public String toString() {
        return "MuteSound{}";
    }

}
