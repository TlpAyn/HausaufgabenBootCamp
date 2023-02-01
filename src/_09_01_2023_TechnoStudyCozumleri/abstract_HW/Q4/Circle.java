package _09_01_2023_TechnoStudyCozumleri.abstract_HW.Q4;

public class Circle extends Data{
    @Override
    double getArea() {
        return pi * getRadius() * getRadius();
    }
}
