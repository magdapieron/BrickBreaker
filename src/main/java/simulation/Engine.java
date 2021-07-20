package simulation;

import objects.*;

import java.util.List;
import java.util.TreeSet;

public class Engine {

    private final LevelParameters parameters;
    private final Board board;

    public Engine()
    {
        parameters = new LevelParameters(15, 40, 20, 60, 10,
                1);

        this.board = new Board(parameters);
    }

    public TreeSet<Brick> getBricks() {
        return board.getBricks();
    }

    public List<Ball> getBall() {
        return board.getBall();
    }

    public Paddle getPaddle() {
        return board.getPaddle();
    }

    public LevelParameters getParameters() {
        return parameters;
    }
}
