package estrategia;

public class ModelDuck extends Duck {
    public ModelDuck() {
        fb = new FlyNoWay();
        sb = new MuteSound();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }

    @Override
    public String toString() {
        return "ModelDuck{}";
    }

}
