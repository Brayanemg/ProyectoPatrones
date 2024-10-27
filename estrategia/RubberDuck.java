package estrategia;

public class RubberDuck extends Duck{

    public RubberDuck() {
        fb = new FlyNoWay();
        sb = new MuteSound();
    }

    @Override
    public String toString() {
        return "RubberDuck{}";
    }

    public void display(){
        System.out.println("Hi I am a RubberDuck");
    }


}
