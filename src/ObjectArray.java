class Circle{

    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }
}

public class ObjectArray {
    public static void main(String[] args) {

        Circle [] circle = new Circle[5];

        for (int i = 0; i < circle.length; i++) circle[i] = new Circle(i);

        for(int i = 0 ; i < circle.length ; i++) System.out.print((int)circle[i].getArea() + " ");


    }
}
