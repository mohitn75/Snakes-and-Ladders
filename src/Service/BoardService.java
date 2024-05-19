package Service;

import Model.Cell;

public interface BoardService {

    public Cell[] initializeBoard(int size);

    public void addSnakesAndLadders(Cell[] board, int numberOfSnakes, int numberOfLadders);
}