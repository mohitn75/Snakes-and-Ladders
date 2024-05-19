import Model.Game;
import Model.Player;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.print("\n**********This is a multiplayer snakes and ladder game, default: 2 players, 50 tiles, 5 snakes, 5 ladders (Everything can be added/ reduced)**********\n\n");

        Player player1 = new Player("Player1", 0);
        Player player2 = new Player("Player2", 0);
        List<Player> playerList = new ArrayList<>();
        playerList.add(player1);
        playerList.add(player2);
        Game game = new Game(playerList);
    }
}