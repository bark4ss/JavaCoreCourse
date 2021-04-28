package storagetask.pathfinding;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int width = 5;
        int height = 5;
        int[][] map = {
                {0,2,3,4,1},
                {2,3,4,4,1},
                {3,4,5,6,2},
                {4,5,6,7,1},
                {6,7,8,7,1}};
        int startIndex = map[0][0];
        int endIndex = map[width-1][height-1];
        List<Node> open = new ArrayList<>();

    }
}
