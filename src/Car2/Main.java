package Car2;

public class Main {
    public static void main(String[] args) {
        Car one = new Car(2010);
        Car two = new Car(one.getYear(), "red");
        Car three = new Car(one.getYear(), two.getColor(), 150);
        Car four = new Car(one.getYear(), two.getColor(), three.getSpeed(), 1500);

        System.out.println(one.getYear());
        System.out.println(two.getYear() + ", " + two.getColor());
        System.out.println(three.getYear() + ", " + three.getColor() + ", " + three.getSpeed());
        System.out.println(four.getYear() + ", " + four.getColor() + ", " + four.getSpeed() + ", " + four.getHeight());

    }
}
