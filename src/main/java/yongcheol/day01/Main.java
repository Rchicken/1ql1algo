package yongcheol.day01;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

    public static int[] solution(int []arr) {
        int front = 10;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int n : arr) {
            if (n != front) {
                front = n;
                stack.addLast(n);
            }
        }
        return stack.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(solution(new int[]{4, 4, 4, 3, 3})));
    }
}