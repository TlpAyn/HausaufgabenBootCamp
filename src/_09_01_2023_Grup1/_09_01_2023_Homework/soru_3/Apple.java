package _09_01_2023_Grup1._09_01_2023_Homework.soru_3;
public class Apple extends Phone {

    @Override
    void options(String str1, String str2) {
        switch (str1) {
            case "1":
                cart.add("$750");
                break;
            case "2":
                cart.add("$850");
                break;
            case "3":
                cart.add("$950");
                break;
            case "4":
                cart.add("$1200");
                break;
            default:
                break;
        }
    }

}
