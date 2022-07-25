package yongcheol.day06;


import java.util.Arrays;

public class Solution {

    public int solution(String dartResult) {
        int answer = 0;
        int[] scores = new int[3];
        int idx = 0;
        int score = 0;
        for (int i = 0; i < dartResult.length(); i++) {
            if (dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9') {
                score = score * 10 + Integer.parseInt(String.valueOf(dartResult.charAt(i)));
            } else if (dartResult.charAt(i) == 'S' || dartResult.charAt(i) == 'D' || dartResult.charAt(i) == 'T') {
                switch (dartResult.charAt(i)) {
                    case 'S' -> scores[idx] = score;
                    case 'D' -> scores[idx] = score * score;
                    case 'T' -> scores[idx] = score * score * score;
                    default -> {}
                }
                score = 0;
                idx++;
            } else {
                if (dartResult.charAt(i) == '#') {
                    scores[idx - 1] *= -1;
                } else if (dartResult.charAt(i) == '*'){
                    scores[idx - 1] *= 2;
                    if (idx - 2 >= 0) {
                        scores[idx - 2] *= 2;
                    }
                }
            }
        }
        for (int s : scores) {
            answer += s;
        }
        return answer;
    }
}
