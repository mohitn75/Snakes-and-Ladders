package Service;

import Model.Board;
import Model.Player;

import java.util.Deque;

public interface GameService {

    public void allowTurns(Board board, Deque<Player> players);
}
