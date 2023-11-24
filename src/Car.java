
public class Car extends Vehicle{



        @Override
        public void start () {
            System.out.println("brum brum");
        }

        @Override
        public void doBreak () {
            System.out.println("stop");
        }

        @Override
        public void accelerate () {
            System.out.println("start");
        }


}
