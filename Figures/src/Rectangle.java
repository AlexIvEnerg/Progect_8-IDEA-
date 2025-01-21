import java.util.Arrays;

public class Rectangle extends Shape {

    private final char[][] rectangle;

    public Rectangle(String color) {
        super(color);

        char[][] rectangle = new char[15][15];
        rectangle[0]=rectangle[14] = new char[] {'0',' ','0',' ','0',' ','0',' ','0',' ','0',' ','0',' ','0'};
        rectangle[1]=rectangle[3]=rectangle[5]=rectangle[7]=rectangle[9]=rectangle[11]=rectangle[13]=new char[] {' '};
        rectangle[2]=rectangle[12] = new char[] {'0','0',' ','0',' ','0',' ','0',' ','0',' ','0',' ','0','0'};
        rectangle[4][0]=rectangle[4][2]=rectangle[4][12]=rectangle[4][14]='0';
        rectangle[6][0]=rectangle[6][2]=rectangle[6][12]=rectangle[6][14]='0';
        rectangle[8][0]=rectangle[8][2]=rectangle[8][12]=rectangle[8][14]='0';
        rectangle[10][0]=rectangle[10][2]=rectangle[10][12]=rectangle[10][14]='0';
        this.rectangle = rectangle;
    }
    void draw(char[][] shape) {
        for(char[] fig : shape) {
            System.out.println(Arrays.toString(fig));
        }    
    }

    char[][] getShape() { return rectangle;}
}
