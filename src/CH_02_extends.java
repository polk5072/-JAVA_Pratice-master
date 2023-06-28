import java.awt.*;

class Point{
    private int x, y;

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint(){
        System.out.println("( " + x + " , " + y + " )");
    }
}

class ColorPoint extends Point{
    private String Color;

    public void setColor(String Color) {
        this.Color = Color;
    }
    public void showColorPoint(){
        System.out.println(Color);
        showPoint();
    }
}
public class CH_02_extends{
    public static void main(String[] args) {
        Point point = new Point();
        point.set(1,2);
        point.showPoint();

        ColorPoint colorpoint = new ColorPoint();
        colorpoint.set(3, 4);
        colorpoint.setColor("Red");
        colorpoint.showColorPoint();
    }

}
