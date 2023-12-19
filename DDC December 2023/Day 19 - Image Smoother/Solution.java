// Problem Link : https://leetcode.com/problems/image-smoother/description/

public class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] smoother = new int[img.length][img[0].length];

        for (int row = 0; row < smoother.length; row++) {
            for (int col = 0; col < smoother[0].length; col++) {
                smoother[row][col] = surroundingFloor(img, row, col);
            }
        }
        return smoother;
    }

    private int surroundingFloor(int[][] img, int row, int col) {
        int count = 0, sum = 0;

        for (int rowDifference = -1; rowDifference <= 1; ++rowDifference) {
            for (int columnDifference = -1; columnDifference <= 1; ++columnDifference) {
                int newRow = row + rowDifference, newColumn = col + columnDifference;

                if (newRow >= 0 && newRow < img.length && newColumn >= 0 && newColumn < img[0].length) {
                    sum += img[newRow][newColumn];
                    count++;
                }
            }
        }

        return (int) Math.floor(sum * 1.00 / count);
    }
}