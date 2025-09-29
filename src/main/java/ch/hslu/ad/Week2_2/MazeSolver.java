package ch.hslu.ad.Week2_2;

public class MazeSolver {

    private char[][] maze;

    public MazeSolver(char[][] maze) {
        this.maze = maze;
    }

    public void findPath(int row, int column) { // TODO: Bessere Parameternamen?
        //  Wenn die Zeilen- oder Spaltennummer ungültig ist, 
        //  dann  beende die Funktion 
        if (row < 0 || column < 0 || row >= maze.length || column >= maze[row].length) {
            return;
        }else if (maze[row][column] == 'X') {
                printMaze();
        }else if (maze[row][column] == ' ') {
                maze[row][column] = '.';
                findPath(row + 1, column); // unten
                findPath(row - 1, column); // oben
                findPath(row, column + 1); // rechts
                findPath(row, column - 1); // links
                maze[row][column] = ' ';
        }
        //  Wenn die Position (Zeile, Spalte) ein Leerzeichen enthält: 
        //  Setze die Position (Zeile, Spalte) auf «.» 
        //  Rufe «findPath» rekursiv auf allen Nachbarfeldern auf 
        //  Setze die Position (Zeile, Spalte) wieder auf ein Leerzeichen.
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