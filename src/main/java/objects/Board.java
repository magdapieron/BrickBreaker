package objects;

import simulation.GameParameters;
import simulation.LevelParameters;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Board {

    private LevelParameters parameters;
    private TreeSet<Brick> bricks;
    private List<Ball> ball;
    private Paddle paddle;

    public Board(LevelParameters parameters)
    {
        this.parameters = parameters;
        createObjects();
    }

    public void createObjects()
    {
        createBall();
        createPlatform();
        createBricks();
    }

    private void createBall()
    {
        ball = new ArrayList<>();
        ball.add(new Ball(parameters.ballRadius()));
    }

    private void createPlatform()
    {
        paddle = new Paddle(parameters.platformWidth(), parameters.platformHeight(),
                new Position(GameParameters.INIT_PADDLE_X, GameParameters.INIT_PADDLE_Y));
    }

    private void createBricks()
    {
        this.bricks = new TreeSet<>();
        for(int i=0; i < 150; i+=15)
        {
            for(int j=0; j <GameParameters.WINDOW_WIDTH; j+=40)
            {
                bricks.add(new Brick(parameters.brickHeight(),parameters.brickWidth(), new Position(j,i),
                        parameters.brickThickness()));
            }
        }
    }

    public void createNewBall()
    {

    }

    public void ballMove()
    {

    }

    public TreeSet<Brick> getBricks() {
        return bricks;
    }

    public List<Ball> getBall() {
        return ball;
    }

    public Paddle getPaddle() {
        return paddle;
    }
}
