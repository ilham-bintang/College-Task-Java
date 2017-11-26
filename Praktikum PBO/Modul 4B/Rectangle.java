public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    // public Circle(double radius) {        
    //     this.radius = radius;
    // }

    public double getArea() {         
        return width*height;
    }
    public double getPerimeter() {        
        return 2*(width+height);
    }
    public String toString() {
        return ("lebar : " + width + "tinggi  " + height + " luas " + (width*height) + "luas : " + 2*(width+height));
    }
    
}