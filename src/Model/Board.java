package Model;

import Service.BoardServiceImpl;

public class Board {

    Cell[] board;
    BoardServiceImpl boardService = new BoardServiceImpl();

    public Cell[] getBoard() {
        return this.board;
    }

    public Board(int size, int numberOfSnakes, int numberOfLadders){
        this.board = boardService.initializeBoard(size);
        boardService.addSnakesAndLadders(this.board, numberOfSnakes, numberOfLadders);
    }

}
