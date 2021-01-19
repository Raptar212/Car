package Car;

public class Main {
    public static void main(String[] args) {
        Carr one = new Carr(1999);
        System.out.println(one.getYear());

        Carr two = new Carr(2010, "red");
        System.out.println(two.getColor() + ", " + two.getYear());

    }
}
