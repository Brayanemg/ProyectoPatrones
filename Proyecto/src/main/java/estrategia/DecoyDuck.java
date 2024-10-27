package estrategia;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        fb = new FlyNoWay();
        sb = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("hi i am a decoyduck");
    }

    @Override
    public String toString() {
        return "DecoyDuck{}";
    }

}
