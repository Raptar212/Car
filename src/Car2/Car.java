package Car2;

public class Car {
    private int year;
    private String color;
    private double speed;
    private int height;

    public Car(int year){
        this.year = year;
    }

    public Car(int year, String color){
        this.year = year;
        this.color = color;
    }

    public Car(int year, String color, double speed){
        this.year = year;
        this.color = color;
        this.speed = speed;
    }

    public Car(int year, String color, double speed, int height){
        this.year = year;
        this.color = color;
        this.speed = speed;
        this.height = height;
    }

    public int getYear() {
        return year;

    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;

    }
    public void setColor(String color) {
        this.color = color;

    }

    public double getSpeed(){
        return speed;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }

    public int getHeight(){
       return height;
    }
    public void setHeight(int height){
        this.height = height;
    }

}
