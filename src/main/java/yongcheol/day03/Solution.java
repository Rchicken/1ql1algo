package yongcheol.day03;

import java.util.Arrays;

public class Solution {

    public String solution(String s) {
        int[] numbers = Arrays.stream(s.split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        return String.valueOf(min) + " " + max;
    }
}
