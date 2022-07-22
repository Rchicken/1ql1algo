package yongcheol.day02;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    private boolean safe(int x, int y, int row, int col) {
        return x >= 0 && x < row && y >= 0 && y < col;
    }

    public int solution(int[][] maps) {
        final int row = maps.length;
        final int col = maps[0].length;
        final int[] dx = new int[]{1, -1, 0, 0};
        final int[] dy = new int[]{0, 0, 1, -1};
        boolean[][] visit = new boolean[row][col];
        Queue<Point> q = new LinkedList<>();
        int answer = 0;

        q.add(new Point(0, 0));
        visit[0][0] = true;
        while (!q.isEmpty()) {
            int size = q.size();
            answer++;
            for (int s = 0; s < size; s++) {
                Point p = q.poll();
                for (int i = 0; i < 4; i++) {
                    int nx = p.getX() + dx[i];
                    int ny = p.getY() + dy[i];
                    if (safe(nx, ny, row, col) && maps[nx][ny] == 1 && !visit[nx][ny]) {
                        if (nx == row-1 && ny == col-1) {
                            return answer+1;
                        }
                        q.add(new Point(nx, ny));
                        visit[nx][ny] = true;
                    }
                }
            }
        }
        return -1;
    }

    static class Point {
        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}

