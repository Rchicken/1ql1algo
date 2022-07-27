package yongcheol.day08;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();
        boolean[] appearance = new boolean[200];
        int size = numbers.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                int sum = numbers[i] + numbers[j];
                if (!appearance[sum]) {
                    answer.add(numbers[i] + numbers[j]);
                    appearance[sum] = true;
                }
            }
        }
        answer.sort((o1, o2) -> o1 - o2);
        return answer.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
