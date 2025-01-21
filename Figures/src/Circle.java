import java.util.Arrays;

public class Circle extends Shape{
    private final char[][] circle;

    public Circle(String color) {
        super(color);

        char[][] circle = new char [15][15];
        circle[0]=circle[14] = new char[] {'0',' ','0',' ','0',' ','0',' ','0',' ','0',' ','0',' ','0'};
        circle[1]=circle[3]=circle[5]=circle[7]=circle[9]=circle[11]=circle[13]= new char[] {' '};
        circle[2][0] = circle[2][5] = circle[2][7]=circle[2][9]=circle[2][14]='0';
        circle[4][0] = circle[4][3]= circle[4][11]=circle[4][14]='0';
        circle[6][0]=circle[6][2]= circle[6][12]=circle[6][14]='0';
        circle[8][0]=circle[8][2]= circle[8][12]=circle[8][14]='0';
        circle[10][0] = circle[10][3]= circle[10][11]=circle[10][14]='0';
        circle[12][0] = circle[12][5]= circle[12][7]=circle[12][9]=circle[12][14]='0';
        this.circle = circle;
    }
    void draw(char[][] shape) {
        for(char[] fig : shape) {
            System.out.println(Arrays.toString(fig));
        }
    }

    public char[][] getShape() {
        return circle;
    }
}
