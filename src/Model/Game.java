package Model;

import Service.GameServiceImpl;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Game {

    public Board board;
    public Deque<Player> players;
    GameServiceImpl gameService = new GameServiceImpl();

    public Game(){
        this.board = new Board(50, 2, 2);
        Player player1 = new Player("Player1", 0);
        Player player2 = new Player("Player2", 0);
        List<Player> playersList = new ArrayList<>();
        playersList.add(player1);
        playersList.add(player2);
        this.players = new LinkedList<>();
        this.players.addAll(playersList);
        gameService.allowTurns(board, players);
    }
}
