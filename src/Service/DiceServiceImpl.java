package Service;

public class DiceServiceImpl implements DiceService{

    @Override
    public int rollDice(){
        return (int)(Math.random() * 6) + 1;
    }

}
