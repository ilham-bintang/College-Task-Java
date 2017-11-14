public class MovableCircle extends MovablePoint implements Movable{
    int radius;
    int center;

    public MovableCircle (int x, int y, int radius) {
        super(x, y);        
        this.radius = radius;
    }

    public String toString() {
        return ("Nilai x : "+x+ " nilai y :"+y+"Nilai paling atas adalah :"+(y-radius) + " paling bawah :"+(y+radius) + "Nilai paling kiri adalah : " + (x-radius) + "Nilai paling kanan adalah" + (x+radius));
    }
    public void moveUp(int ymove) {
        super.moveUp(ymove);
    }
    public void moveDown(int ymove) {
        super.moveDown(ymove);
    }
    public void moveLeft(int xmove) {
        super.moveLeft(xmove);
    }
    public void moveRight(int xmove) {
        super.moveRight(xmove);
    }
    
}