package zadanie6;

import java.util.*;

public class Zadanie6 {

    private static Map<Integer, Integer> openBrackets = new HashMap<Integer, Integer>();
    private static Map<Integer, Integer> closeBrackets = new HashMap<Integer, Integer>();
    private static List<Integer> currentlyOpen = new LinkedList<Integer>();
    private static char[] input;

    public Zadanie6(String input) {
        openBrackets.put(40, 41);
        closeBrackets.put(41, 40);
        openBrackets.put(91, 93);
        closeBrackets.put(93, 91);
        openBrackets.put(123, 125);
        closeBrackets.put(125, 123);
        this.input = input.toCharArray();
    }

    public static boolean checkBrackets() {
        for (int i = 0; i < input.length; i++) {
            int asciiValue = input[i];
            if (openBrackets.containsKey(asciiValue) ) {
                currentlyOpen.add(0, asciiValue);
            } else if (closeBrackets.containsKey(asciiValue)) {

                if( currentlyOpen.isEmpty()) { return false;}

                // zamykany
                if ( closeBrackets.get(asciiValue) != currentlyOpen.get(0)){
                    return false;
                } else {
                    currentlyOpen.remove(0);
                }
            }
        }
        return true;
    }
    }
