package interview;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class StringTwins {

    public static List<String> twins(List<String> firstString, List<String> secondString) {
        List<String> result = new ArrayList<>();
        int n = firstString.size();

        for (int i = 0; i < n; i++) {
            String a = firstString.get(i);
            String b = secondString.get(i);

            if (a.length() != b.length()) {
                result.add("No");
                continue;
            }

            // Separate even and odd indexed characters for both strings
            char[] aEven = new char[(a.length() + 1) / 2];
            char[] aOdd = new char[a.length() / 2];
            char[] bEven = new char[(b.length() + 1) / 2];
            char[] bOdd = new char[b.length() / 2];

            // Populate even and odd arrays for both strings
            for (int j = 0; j < a.length(); j++) {
                if (j % 2 == 0) {
                    aEven[j / 2] = a.charAt(j);
                } else {
                    aOdd[j / 2] = a.charAt(j);
                }
            }

            for (int j = 0; j < b.length(); j++) {
                if (j % 2 == 0) {
                    bEven[j / 2] = b.charAt(j);
                } else {
                    bOdd[j / 2] = b.charAt(j);
                }
            }

            // Sort and compare even and odd arrays
            Arrays.sort(aEven);
            Arrays.sort(bEven);
            Arrays.sort(aOdd);
            Arrays.sort(bOdd);

            if (Arrays.equals(aEven, bEven) && Arrays.equals(aOdd, bOdd)) {
                result.add("Yes");
            } else {
                result.add("No");
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage
        List<String> firstString = Arrays.asList("abcd", "abcd");
        List<String> secondString = Arrays.asList("cbad","adbc");

        List<String> result = twins(firstString, secondString);
        for (String res : result) {
            System.out.println(res);
        }
    }
}