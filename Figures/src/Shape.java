public abstract class Shape {
    String color;
    public Shape (String col) { this.color = col;}
    abstract void draw(char[][] shape);
    abstract char[][] getShape();
}
