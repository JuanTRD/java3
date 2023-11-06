package OOP;

public class Rectangle {
    public int width;
    public int height;
    public Rectangle() {}
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width*height;
    }
    public double getPerimeter() {
        return (width+height)*2;
    }
    public String display() {
        return "Rectangle {width: " + width + ", height: " + height + "}";
    }

}
