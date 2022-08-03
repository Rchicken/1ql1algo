package yongcheol.day12;

public class Solution {

    public String solution(int a, int b) {
        int day = b;
        String[] days = new String[]{"THU", "FRI", "SAT","SUN", "MON", "TUE", "WED"};
        int[] months = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < a-1; i++) {
            day += months[i];
        }
        return days[day % 7];
    }
}

