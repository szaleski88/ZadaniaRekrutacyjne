package zadanie11;

import java.util.HashSet;
import java.util.Set;

public class Zadanie11 {

    static Set<String> results = new HashSet<String>();

    public static void main(String[] args) {
        Zadanie11 z = new Zadanie11();
        z.checkString("","ABC");
        showRestult();
    }

    private static void showRestult() {
        for (String res: results){
            System.out.println(res);
        }
    }


    public void checkString(String part, String str){
        if(str.isEmpty()){
            results.add(part);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            checkString(part + str.substring(i, i+1), str.substring(0,i) +  str.substring(i+1));
        }
    }
}
