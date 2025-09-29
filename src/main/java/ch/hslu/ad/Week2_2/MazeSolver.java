package ch.hslu.ad.Week2_2;

public class MazeSolver {

    private char[][] maze;

    public MazeSolver(char[][] maze) {
        this.maze = maze;
    }

public boolean findPath(int row, int column) { 

    if (row < 0 || column < 0 || row >= maze.length || column >= maze[row].length) {
        return false;
    }

    if (maze[row][column] == '#' || maze[row][column] == '.') {
        return false;
    }
    
    if (maze[row][column] == 'X') {
        printMaze();
        return true; 
    }

    if (maze[row][column] == ' ') {
        maze[row][column] = '.';
        if (findPath(row + 1, column)) { // down
            return true; 
        }
        if (findPath(row - 1, column)) { // up
            return true;
        }
        if (findPath(row, column + 1)) { // right
            return true;
        }
        if (findPath(row, column - 1)) { // left
            return true;
        }

        maze[row][column] = ' ';
        return false;
    }
    return false; 
}

    private void printMaze() {
    for (int i = 0; i < maze.length; i++) {
        for (int j = 0; j < maze[i].length; j++) {
            System.out.print(maze[i][j] + " ");
                }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char[][] mazeExample = {
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' } };

        MazeSolver solver = new MazeSolver(mazeExample);
        solver.findPath(0,0);
    }
}