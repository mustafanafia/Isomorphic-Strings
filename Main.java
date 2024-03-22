import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Main o = new Main();

        System.out.println(o.isIsomorphic("egg", "add"));

    }


    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character, Character> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if (!hm.containsKey(original) && !hm.containsValue(replacement)) {
                hm.put(original, replacement);
            }
            else if (hm.containsKey(original)) {
                char duplicate_element = hm.get(original);
                if (duplicate_element != replacement) {
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}