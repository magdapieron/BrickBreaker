package objects;

public class Position {

    private int x;
    private int y;
    private final int windowWidth;
    private final int windowHeight;

    public Position(int windowWidth, int windowHeight,int x, int y)
    {
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWindowWidth() {
        return windowWidth;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

}
