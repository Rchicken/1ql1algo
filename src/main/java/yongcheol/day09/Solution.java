package yongcheol.day09;

public class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int cost = price;
        for (int i = 0; i < count; i++) {
            answer += cost;
            cost += price;
        }

        return money - answer >= 0 ? 0 : answer - money;
    }
}
