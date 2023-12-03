// Problem Link : https://leetcode.com/problems/minimum-time-visiting-all-points/description/

public class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;

        for (int i = 1; i < points.length; i++) {
            time += toTime(points[i - 1], points[i]);
        }

        return time;
    }

    public int toTime(int[] from, int[] to) {
        int xDiff = Math.abs(from[0] - to[0]);
        int yDiff = Math.abs(from[1] - to[1]);

        return Math.max(xDiff, yDiff);
    }

    // Ignore this main class
    public static void main(String[] args) {

    }
}