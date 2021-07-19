package simulation;

import objects.*;

import java.util.TreeSet;

public class Engine {

    private final int windowWidth;
    private final int windowHeight;
    private LevelParameters parameters;
    private Board board;

    public Engine(int windowWidth, int windowHeight)
    {
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;

        parameters = new LevelParameters(50, 100, 15, 100, 10,
                windowWidth/2, 700, windowWidth/2, 465, 1);

        this.board = new Board(parameters, windowWidth, windowHeight);
    }

    public TreeSet<Brick> getBricks() {
        return board.getBricks();
    }

    public Ball getBall() {
        return board.getBall();
    }

    public Paddle getPaddle() {
        return board.getPaddle();
    }

    public LevelParameters getParameters() {
        return parameters;
    }
}
