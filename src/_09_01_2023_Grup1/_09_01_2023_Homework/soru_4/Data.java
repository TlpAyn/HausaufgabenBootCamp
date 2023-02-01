package _09_01_2023_Grup1._09_01_2023_Homework.soru_4;

public abstract class Data {
    abstract double getArea();
    static final double pi=3.14;
    private int radius;
    private int length;
    private int width;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
