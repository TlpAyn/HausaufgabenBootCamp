package _09_01_2023_TechnoStudyCozumleri.abstract_HW.Q3;

public class apple extends phone{
    @Override
    public void options(String capacity, String screenSize) {
        if (capacity.contains("128") && screenSize.contains("5.5")) {card.add("750$");}
        else if (capacity.contains("128") && screenSize.contains("6.5")) {card.add("850$");}
        else if (capacity.contains("256") && screenSize.contains("5.5")) {card.add("950$");}
        else if (capacity.contains("256") && screenSize.contains("6.5")) {card.add("1200$");}
    }
}
