package Model;

import Service.GameServiceImpl;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Game {

    public Board board;
    public Deque<Player> players;
    GameServiceImpl gameService = new GameServiceImpl();

    public Game(List<Player> playersList){
        this.players = new LinkedList<>();
        this.board = new Board(50, 5, 5);
        this.players.addAll(playersList);
        gameService.allowTurns(board, players);
    }
}
