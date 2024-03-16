package projava;

public class Maze {
    public static void main(String[] args) {
        record Position(int x, int y) {}
        int[][] map = {
                {1, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 1, 1},
                {1, 0, 1, 0, 0, 1},
                {1, 1, 1, 1, 1, 1},
        };
        var current = new Position(1, 1);
        var goal = new Position(4, 3);
//        for (;;) {
//            for ()
//        }
    }
}
