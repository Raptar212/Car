package Car;

public class Carr {
    private int year;
    private String color;

    public Carr(int year){
        this.year = 1999;
    }

    public Carr(int year, String color){
        this.year = 2010;
        this.color = "red";
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
}
