/**
 * Implementasi
 */ 
public class Implementasi {
    public static void main(String[] args) {
        Circle c = new Circle(5, "merah", true);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());

        Rectangle r = new Rectangle("Merah", true, 10, 5);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        
    }
    
}