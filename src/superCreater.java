class Point1{
    private int x, y;

    public Point1(){
        this.x = this.y = 0;
    }

    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint(){
        System.out.println("("+ x + ","+ y + ")");
    }
}

class ColorPoint1 extends Point1{

    private String color;

    public ColorPoint1(int x, int y, String Color){
        super(x,y);
        this.color = Color;
    }

    public void showColorPoint(){
        System.out.println(color);
        showPoint();
    }
}

public class superCreater {

    public static void main(String[] args) {
        ColorPoint1 cp1 = new ColorPoint1(5, 6, "Red");
        cp1.showColorPoint();
    }




}
