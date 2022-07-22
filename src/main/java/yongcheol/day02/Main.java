package yongcheol.day02;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(
            solution.solution(new int[][] {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}
        }));
    }
}
