package simulation;

import objects.*;

import java.util.TreeSet;

public class Board {

    private LevelParameters parameters;
    private TreeSet<Brick> bricks;
    private Ball ball;
    private Paddle paddle;
    private final int windowWidth;
    private final int windowHeight;

    public Board(LevelParameters parameters,int windowWidth, int windowHeight)
    {
        this.parameters = parameters;
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
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
        ball = new Ball(parameters.ballRadius(), new Position(windowWidth,windowHeight, windowWidth/2, 350));
    }

    private void createPlatform()
    {
        paddle = new Paddle(parameters.platformWidth(), parameters.platformHeight(),
                new Position(windowWidth, windowHeight, windowWidth/2-parameters.platformWidth()/2, 450));
    }

    private void createBricks()
    {
        this.bricks = new TreeSet<>();
        for(int i=0; i < windowHeight/parameters.brickHeight(); i++)
        {
            for(int j=0; j < windowWidth/parameters.brickWidth(); j++)
            {
                bricks.add(new Brick(parameters.brickHeight(),parameters.brickWidth(), new Position(windowWidth, windowHeight, i,j),
                        parameters.brickThickness()));
            }
        }
    }

    public TreeSet<Brick> getBricks() {
        return bricks;
    }

    public Ball getBall() {
        return ball;
    }

    public Paddle getPaddle() {
        return paddle;
    }
}
