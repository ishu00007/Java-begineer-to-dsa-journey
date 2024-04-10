package day7;

public class _12_Constructors {

    public static class Bike {
        String color;
        int maxSpeed;
        int price;
        static int NoOfBikeSold;

        public String getColor() {
            return color;
        }

        public void setColor(String c) {
            color = c;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int speed) {
            maxSpeed = speed;
        }

        public int getPrice() {
            return price;
        }

        Bike(String color) {
            maxSpeed = 100;
            price = 100000;
            this.color = color;
        }

        static {
            NoOfBikeSold = 0;
        }

        {
            NoOfBikeSold++;
            System.out.println(NoOfBikeSold);
        }

        // constructor chaining

        Bike() {
            this("white");
            price = 90000;
        }
    }

    public static void main(String[] args) {
        Bike bike = new Bike("gray");
        Bike bike2 = new Bike();

        System.out.println(bike.getMaxSpeed());
        bike.setMaxSpeed(299);
        System.out.println(bike.getMaxSpeed());
        System.out.println(bike.getColor());
        System.out.println(bike.getPrice());

        System.out.println(bike2.getColor());
    }
}
