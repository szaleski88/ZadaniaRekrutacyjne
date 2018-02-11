package zadanie7;

public class Zadanie7 {

    public static String getBinary(int input) {
        String result = "";
        int currentPower = (int)(Math.log(input)/Math.log(2));
        while(currentPower >= 0){
            if (input >= Math.pow(2, currentPower)  ){
                input -= Math.pow(2, currentPower);
                result += "1";
            } else {
                result += "0";
            }
            currentPower--;
        }
        return result;
    }
}
