package _09_01_2023_TechnoStudyCozumleri.abstract_HW.Q3;

public class samsung extends phone{
    @Override
    public void options(String capacity, String screenSize) {
        if (capacity.contains("256") && screenSize.contains("5.5")) {card.add("1100$");}
        else if (capacity.contains("256") && screenSize.contains("7.5")) {card.add("1200$");}
        else if (capacity.contains("512") && screenSize.contains("5.5")) {card.add("1300$");}
        else if (capacity.contains("512") && screenSize.contains("7.5")) {card.add("1400$");}
    }
}
