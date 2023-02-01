package _09_01_2023_Odev._09_01_2023_Odev_04;

public abstract class Data {
    static final double pi = 3.14;
    private int radius;
    private int lenght;
    private int widht;


    protected abstract double getArea();

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }


}
