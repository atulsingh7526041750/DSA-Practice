package interview;

import java.util.*;

public class ShuttleMissionScheduler {

    public static int solution(int[] alpha2beta, int[] beta2alpha, int missions) {
        int currentTime = 0;

        for (int i = 0; i < missions; i++) {
            // Take earliest Alpha → Beta shuttle >= currentTime
            int a2bIndex = findEarliestShuttle(alpha2beta, currentTime);
            int arrivalAtBeta = alpha2beta[a2bIndex] + 100;

            // Take earliest Beta → Alpha shuttle >= arrivalAtBeta
            int b2aIndex = findEarliestShuttle(beta2alpha, arrivalAtBeta);
            int arrivalAtAlpha = beta2alpha[b2aIndex] + 100;

            currentTime = arrivalAtAlpha;
        }

        return currentTime;
    }

    // Binary search to find earliest shuttle >= targetTime
    private static int findEarliestShuttle(int[] schedule, int targetTime) {
        int left = 0, right = schedule.length - 1;
        int result = schedule.length; // out of bounds (shouldn't happen due to constraints)

        while (left <= right) {
            int mid = (left + right) / 2;
            if (schedule[mid] >= targetTime) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    // For quick testing
    public static void main(String[] args) {
        int[] alpha2beta = {5, 206};
        int[] beta2alpha = {105, 306};
        int missions = 2;
        System.out.println(solution(alpha2beta, beta2alpha, missions));  // Output: 406
    }
}
