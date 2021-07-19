package objects;

// used only for game levels - next level, different parameters
// in other step in engine will be created array with different parameters

public record LevelParameters( int brickHeight, int brickWidth, int ballRadius, int platformWidth, int platformHeight,
                               int platformInitialX, int platformInitialY, int ballInitialX, int ballInitialY, int brickThickness) {
}
