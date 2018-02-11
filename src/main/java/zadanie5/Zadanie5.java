package zadanie5;

public class Zadanie5 {

    private static String[] letters;

    public static String rle(String input) {
        String result = "";
        if(input == null || input.isEmpty()) { return ""; }
        letters = input.split("");


        String part = letters[0];
        String previousLetter = letters[0];
        int count = 1;

        for (int i = 1; i < letters.length   ; i++) {
            String currentLetter = letters[i];
            if(currentLetter.equals(previousLetter)) {
                count++;
            }
            else {
                if (count == 1) {
                    part += currentLetter;
                }else {
                    result += part + ";" + count + ";";
                    part = currentLetter;
                    count = 1;
                }
            }
            previousLetter = currentLetter;
        }
        return result + part + ";" + count + ";";
    }


    public static void main(String[] args) {
        System.out.println(Zadanie5.rle("AB"));
    }


}
