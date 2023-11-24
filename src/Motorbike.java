public class Motorbike extends Vehicle{

    String color;
    double ps;


    @Override
    public void start() {
        System.out.println("Das Motorrad startet");
    }

    @Override
    public void doBreak() {
        System.out.println("Das Motorrad macht eine Pause");
    }

    @Override
    public void accelerate() {
        System.out.println("Das Motorrad beschleunigt.");

    }
}
