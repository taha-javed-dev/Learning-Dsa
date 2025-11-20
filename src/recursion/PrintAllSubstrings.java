package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubstrings {
     static void main() {

         printAllSubstrings("abc",0,"");


    }

    static void printAllSubstrings(String s, int i, String crr) {

            if (i == s.length()) {
                System.out.println(crr);
                return;
            }
            printAllSubstrings(s, i + 1, crr + s.charAt(i));
            printAllSubstrings(s, i + 1, crr);

    }
}
