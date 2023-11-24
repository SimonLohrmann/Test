public class Boat extends Vehicle {



    @Override
    public void start() {
        System.out.println("BrumBrum");
    }

    @Override
    public void doBreak() {
        System.out.println("Break");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate");
    }
}
