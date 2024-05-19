package Service;

import Model.Cell;
import Model.Jump;

import java.util.Scanner;

public class BoardServiceImpl implements BoardService{

    @Override
    public Cell[] initializeBoard(int size){
        Cell[] board = new Cell[size];
        for(int i = 0 ; i < size; i++){
            board[i] = new Cell(null);
        }
        return board;
    }

    @Override
    public void addSnakesAndLadders(Cell[] board, int numberOfSnakes, int numberOfLadders){
        while(numberOfSnakes > 0){
            System.out.printf("Enter Coordinates for snake %d\n", numberOfSnakes);
            Scanner scanner = new Scanner(System.in);
            int starting = scanner.nextInt();
            int ending = scanner.nextInt();
            while(starting > board.length && ending > board.length && ending >= starting){
                System.out.println("Entered Coordinates for snake are invalid");
                starting = scanner.nextInt();
                ending = scanner.nextInt();
            }
            Jump jump = new Jump(starting, ending);
            Cell cell = new Cell(jump);
            board[starting] = cell;
            numberOfSnakes--;
        }
        while(numberOfLadders > 0){
            System.out.printf("Enter Coordinates for ladder %d\n", numberOfLadders);
            Scanner scanner = new Scanner(System.in);
            int starting = scanner.nextInt();
            int ending = scanner.nextInt();
            while(ending > board.length && starting >= ending){
                System.out.println("Entered Coordinates for ladder are invalid");
                starting = scanner.nextInt();
                ending = scanner.nextInt();
            }
            Jump jump = new Jump(starting, ending);
            Cell cell = new Cell(jump);
            board[starting] = cell;
            numberOfLadders--;
        }

    }
}
