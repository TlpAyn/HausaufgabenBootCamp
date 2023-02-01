package _09_01_2023_Grup1._09_01_2023_Homework.soru_3;

public class Samsung extends Phone {
    @Override
    void options(String str3, String str4) {
        switch (str3) {
            case "1":
                cart.add("$1000");
                break;
            case "2":
                cart.add("$1200");
                break;
            case "3":
                cart.add("$1300");
                break;
            case "4":
                cart.add("$1400");
                break;
            default:
                break;
        }
    }
}
