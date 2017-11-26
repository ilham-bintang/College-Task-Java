public class Circle extends Shape{
    double radius;
    double area;
    double kel;

    public Circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }
    // public Circle(double radius) {        
    //     this.radius = radius;
    // }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        area = 3.14*Math.pow(radius,2);
        return area;
    }
    public double getPerimeter() {
        kel = 3.14*radius*radius;
        return kel;
    }
    public String toString() {
        return ("jari -jari : " + radius + "keliling " + (3.14*radius*radius) + "luas : " + (3.14*Math.pow(radius,2)) );
    }
    
}