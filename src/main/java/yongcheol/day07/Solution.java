package yongcheol.day07;

import java.util.Arrays;

public class Solution {

    private String decimalToBinary(int number, int size) {
        boolean st = false;
        String map = "";
        int[] binary = new int[size];
        int x = 0;
        while (number > 0) {
            binary[x] = number % 2;
            number = number / 2;
            x++;
        }
        for (int i = size - 1; i >=0; i--) {
            if (!st && binary[i] == 0) {
                map += " ";
            } else {
                st = true;
                if (binary[i] == 1) {
                    map += "#";
                } else {
                    map += " ";
                }
            }
        }
        System.out.println(map.length());
        return map;
    }
    private String addMap(String map1, String map2, int n) {
        String map = "";
        for (int i = 0; i < n; i++) {
            if (map1.charAt(i) == '#' || map2.charAt(i) == '#') {
                map += "#";
            } else {
                map += " ";
            }
        }
        return map;
    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] map1 = new String[n];
        String[] map2 = new String[n];
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            map1[i] = decimalToBinary(arr1[i], n);
            map2[i] = decimalToBinary(arr2[i], n);
            answer[i] = addMap(map1[i], map2[i], n);
        }
        return answer;
    }


}
