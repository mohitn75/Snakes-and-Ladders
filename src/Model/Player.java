package Model;

public class Player {

    String playerName;
    int playerPosition;

    public Player(String playerName, int playerPosition){
        this.playerName = playerName;
        this.playerPosition = playerPosition;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

}
