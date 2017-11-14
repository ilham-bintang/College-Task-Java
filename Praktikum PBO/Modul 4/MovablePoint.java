public class MovablePoint implements Movable {
    int x, y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return ("Nilai titik x adalah :"+x + " y :"+y);
    }
    public void moveUp(int ymove) {
        y-=ymove;
    }
    public void moveDown(int ymove) {
        y+=ymove;
    }
    public void moveLeft(int xmove) {
        x-=xmove;
    }
    public void moveRight(int xmove) {
        x+=xmove;
    }
}