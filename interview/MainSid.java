import java.util.*;

public class MainSid {

    public static int solution(int[] fragments, int accessCode) {
        String target = String.valueOf(accessCode);
        Map<String, Integer> freqMap = new HashMap<>();
        int count = 0;

        // Step 1: Build frequency map
        for (int fragment : fragments) {
            String s = String.valueOf(fragment);
            freqMap.put(s, freqMap.getOrDefault(s, 0) + 1);
        }

        // Step 2: Check every pair (s1, s2) where s1 + s2 == target
        for (String s1 : freqMap.keySet()) {
            String s2 = target.startsWith(s1) ? target.substring(s1.length()) : null;
            if (s2 != null && freqMap.containsKey(s2)) {
                int c1 = freqMap.get(s1);
                int c2 = freqMap.get(s2);
                if (s1.equals(s2)) {
                    // choose 2 from c1 => c1 * (c1 - 1)
                    count += c1 * (c1 - 1);
                } else {
                    // c1 * c2 pairs
                    count += c1 * c2;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 212, 12, 12}, 1212)); // 3
        System.out.println(solution(new int[]{11, 11, 110}, 11011));   // 2
        System.out.println(solution(new int[]{777, 7, 777, 77, 77}, 7777)); // 6
        System.out.println(solution(new int[]{1000, 100, 10, 20, 10000, 1000000000, 1000000000}, 1000000000)); // 0
        System.out.println(solution(new int[]{1, 6, 12, 6, 3456, 12345, 123, 123456}, 123456));
    }
}
