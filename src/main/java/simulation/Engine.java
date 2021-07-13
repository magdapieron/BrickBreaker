package simulation;

import objects.Ball;
import objects.Brick;
import objects.Platform;

import java.util.TreeSet;

public class Engine {

    private TreeSet<Brick> bricks;
    private Ball ball;
    private Platform platform;
    private int windowWidth;
    private int windowHeight;
    private int brickHeight = 5;
    private int brickWidth = 10;

    public Engine(int windowWidth, int windowHeight)
    {
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
        this.bricks = new TreeSet<>();
        createObjects();
    }

    private void createObjects()
    {
        for(int i=0; i < windowHeight/brickHeight; i++)
        {
            for(int j=0; j < windowWidth/brickWidth; j++)
            {
                bricks.add(new Brick(j,i,brickHeight,brickWidth));
            }
        }

        ball = new Ball(windowWidth);
        platform = new Platform(windowWidth);
    }

    public TreeSet<Brick> getBricks() {
        return bricks;
    }

    public Ball getBall() {
        return ball;
    }

    public Platform getPlatform() {
        return platform;
    }
}
