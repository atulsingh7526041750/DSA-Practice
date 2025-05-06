package interview;

import java.util.*;

public class GatewayThrottling {

    public static List<String> getDomainRequestStatus(List<String> requests) {
        Map<String, Deque<Integer>> shortWindow = new HashMap<>();
        Map<String, Deque<Integer>> longWindow = new HashMap<>();

        List<String> result = new ArrayList<>();

        for (int time = 0; time < requests.size(); time++) {
            String domain = requests.get(time);

            shortWindow.putIfAbsent(domain, new LinkedList<>());
            longWindow.putIfAbsent(domain, new LinkedList<>());

            Deque<Integer> shortQ = shortWindow.get(domain);
            Deque<Integer> longQ = longWindow.get(domain);

            // Remove timestamps outside the 5-second and 30-second windows
            while (!shortQ.isEmpty() && shortQ.peekFirst() <= time - 5) {
                shortQ.pollFirst();
            }
            while (!longQ.isEmpty() && longQ.peekFirst() <= time - 30) {
                longQ.pollFirst();
            }

            // Apply throttling logic
            if (shortQ.size() >= 2 || longQ.size() >= 5) {
                result.add("{status: 429, message: Too many requests}");
            } else {
                result.add("{status: 200, message: OK}");
                shortQ.addLast(time);
                longQ.addLast(time);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> requests = Arrays.asList(
                "www.xyz.com", "www.abc.com", "www.xyz.com",
                "www.pqr.com", "www.abc.com", "www.xyz.com", "www.xyz.com"
        );

        List<String> output = getDomainRequestStatus(requests);
        output.forEach(System.out::println);
    }
}
