package strategy;

public class Robot {
    private Behavior strategy;

    public Robot() {
    }

    public Robot(Behavior strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Behavior strategy) {
        this.strategy = strategy;
    }

    public void move(){
        strategy.move();
    }
}
