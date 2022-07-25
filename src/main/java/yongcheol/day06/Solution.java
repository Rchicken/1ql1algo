package yongcheol.day06;


public class Solution {

    public int solution(String dartResult) {
        int answer = 0;
        int[] scores = new int[3];
        int idx = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            int score = 0;
            while (dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9') {
                score = score * 10 + Integer.parseInt(String.valueOf(dartResult.charAt(i)));
                i++;
            }
            switch (dartResult.charAt(i)) {
                case 'S' -> scores[idx] = score;
                case 'D' -> scores[idx] = score * score;
                case 'T' -> scores[idx] = score * score * score;
                default -> {}
            }
            i++;
            if (dartResult.length() == i)
                break;
            switch (dartResult.charAt(i)) {
                case '*' -> {
                    for (int j = idx; j >= 0; j--) {
                        scores[j] *= 2;
                    }
                    scores[idx++] *= 2;
                }
                case '#' -> {
                    for (int j = idx; j >= 0; j--) {
                        scores[j] *= -1;
                    }
                    scores[idx++] *= -1;
                }
                default -> {}
            }
        }
        for (int score : scores) {
            answer += score;
        }
        return answer;
    }
}
