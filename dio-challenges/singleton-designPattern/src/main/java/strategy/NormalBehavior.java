package strategy;

public class NormalBehavior implements Behavior{

    @Override
    public void move() {
        System.out.println("Normally moving");
    }
}
