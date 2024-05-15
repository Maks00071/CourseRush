package Module1;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x < 0 ? 0 : x;
        this.y = y < 0 ? 0 : y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x < 0 ? 0 : x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y < 0 ? 0 : y;
    }
}























