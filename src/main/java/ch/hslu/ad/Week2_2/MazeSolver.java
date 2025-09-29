package ch.hslu.ad.Week2_2;

public class MazeSolver {

    private char[][] maze;

    public MazeSolver(char[][] maze) {
        this.maze = maze;
    }

// 1. Change return type from 'void' to 'boolean'
public boolean findPath(int row, int column) { 

    // 1. Base case: Invalid position (Boundary check)
    if (row < 0 || column < 0 || row >= maze.length || column >= maze[row].length) {
        return false; // Failure: Out of bounds
    }

    // 2. Base case: Already blocked or visited (Wall '#' or marked '.')
    if (maze[row][column] == '#' || maze[row][column] == '.') {
        return false; // Failure: Blocked
    }
    
    // 3. Goal condition (Exit 'X')
    if (maze[row][column] == 'X') {
        printMaze();
        // Return true immediately! This value will stop all higher calls.
        return true; 
    }
    
    // 4. Recursive step (Current cell is a path ' ')
    if (maze[row][column] == ' ') {
        maze[row][column] = '.'; // Mark current cell as part of the tentative path

        // Check each direction. If any call returns true, propagate success upwards!
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

        // 5. Backtracking: This is ONLY executed if all four recursive calls failed.
        maze[row][column] = ' '; // Unmark (backtrack)
        return false; // Failure from this path
    }
    
    // Default return for any other character (like the starting position)
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
                { ' ', ' ', ' ', '#', '#', '#', '#', '#', '#', '#' },
                { ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#', '#' },
                { ' ', '#', ' ', '#', '#', '#', ' ', '#', ' ', '#' },
                { ' ', '#', ' ', '#', ' ', ' ', ' ', '#', ' ', '#' },
                { '#', '#', ' ', '#', '#', '#', ' ', '#', ' ', '#' },
                { '#', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', '#', '#', '#', '#', '#', '#', ' ' },
                { ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', '#', '#', '#', '#', '#', '#', ' ', '#', '#' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' } };

        MazeSolver solver = new MazeSolver(mazeExample);
        solver.findPath(0,0);
    }
}