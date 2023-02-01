package _09_01_2023_Grup1._09_01_2023_Homework.soru_4;

import _09_01_2023_Odev._09_01_2023_Odev_04.Data;

public class Rechtangle extends Data {
    @Override
    protected double getArea() {
        return getLenght()*getWidht();
    }
}
