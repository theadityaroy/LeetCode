// Problem Link : https://leetcode.com/problems/path-crossing/description/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> visited = new HashSet<>();
        int x = 0, y = 0;
        visited.add(x + "," + y);

        for (char move : path.toCharArray()) {
            switch (move) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }

            String currentPosition = x + "," + y;
            if (visited.contains(currentPosition)) {
                return true;
            }

            visited.add(currentPosition);
        }

        return false;
    }

}
