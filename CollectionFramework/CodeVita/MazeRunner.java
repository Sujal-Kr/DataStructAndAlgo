package CollectionFramework.CodeVita;

import java.util.*;

public class MazeRunner {
    public static class Cell {
        int row, col, dist;
        Cell(int row, int col, int dist) {
            this.row = row;
            this.col = col;
            this.dist = dist;
        }
    }

    public static int findShortestPath(int[][] maze, int[] source, int[] target) {
        int R = maze.length, C = maze[0].length;
        boolean[][][] visited = new boolean[R][C][4];
        Queue<Cell> queue = new LinkedList<>();
        Cell srcCell = new Cell(source[0], source[1], 0);
        queue.add(srcCell);
        visited[srcCell.row][srcCell.col][0] = true;

        int[] rowOffsets = {-1, 0, 1, 0};
        int[] colOffsets = {0, 1, 0, -1};

        while (!queue.isEmpty()) {
            Cell currCell = queue.poll();
            if (currCell.row == target[0] && currCell.col == target[1]) {
                return currCell.dist;
            }

            for (int i = 0; i < 4; i++) {
                int rowOffset = rowOffsets[i];
                int colOffset = colOffsets[i];
                int row = currCell.row + rowOffset;
                int col = currCell.col + colOffset;
                int dist = currCell.dist + 1;

                if (row >= 0 && row < R && col >= 0 && col < C && maze[row][col] != 1) {
                    if (!visited[row][col][i] && maze[row][col] != 2 && maze[row][col] != 3) {
                        Cell newCell = new Cell(row, col, dist);
                        queue.add(newCell);
                        visited[row][col][i] = true;
                    } else if (maze[row][col] == 2 && !visited[row][col][i]) {
                        int newDist = currCell.dist + 1;
                        Cell newCell = new Cell(row, col, newDist);
                        queue.add(newCell);
                        visited[row][col][i] = true;
                    } else if (maze[row][col] == 3 && !visited[row][col][i]) {
                        Cell newCell = new Cell(row, col, dist);
                        queue.add(newCell);
                        visited[row][col][i] = true;
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int C = scanner.nextInt();
        int[][] maze = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }
        int[] source = {scanner.nextInt(), scanner.nextInt()};
        int[] target = {scanner.nextInt(), scanner.nextInt()};
        System.out.println(findShortestPath(maze, source, target));
        scanner.close();
    }
}