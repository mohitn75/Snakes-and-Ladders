package Service;

import Model.Board;
import Model.Player;

import java.util.Deque;

public class GameServiceImpl implements GameService{

    public boolean winnerDeclared = false;
    DiceService diceService = new DiceServiceImpl();


    @Override
    public void allowTurns(Board board, Deque<Player> players){
        while(!winnerDeclared){
            System.out.println(board.getBoard().length);
            int moveValue = diceService.rollDice();
            Player currentPlayer = players.poll();
            players.add(currentPlayer);
            assert currentPlayer != null;
            if(currentPlayer.getPlayerPosition() == board.getBoard().length - 1){
                winnerDeclared = true;
                System.out.printf("Congratulations !! %s has won the game", currentPlayer.getPlayerName());
                break;
            }
            System.out.printf("%s turn: Dice Roll: %d \n", currentPlayer.getPlayerName(), moveValue);
            if(currentPlayer.getPlayerPosition() + moveValue < board.getBoard().length){
                int currentPosition = currentPlayer.getPlayerPosition() + moveValue;
                if(board.getBoard()[currentPosition].jump != null){
                    currentPosition = board.getBoard()[currentPosition].jump.endPoint;
                }
                currentPlayer.setPlayerPosition(currentPosition);
                System.out.printf("%s current position: %d\n", currentPlayer.getPlayerName(), currentPosition);
            }
            else{
                System.out.printf("%s overshot the last tile current position: %d\n", currentPlayer.getPlayerName(), currentPlayer.getPlayerPosition());
            }
        }
    }

}
