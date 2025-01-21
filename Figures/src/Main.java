//import Java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("red");   
        shapes[0].draw(shapes[0].getShape());
        shapes[1] = new Rectangle("red");
        shapes[1].draw(shapes[1].getShape());   
    }
}