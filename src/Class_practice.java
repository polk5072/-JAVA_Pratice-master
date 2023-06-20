
public class Class_practice {
    public static class Circle{
        public int radius; // 원의 반지름 필드
        public String name; //원의 이름 필드

        public Circle(int r, String n){
            this.radius = r;
            this.name = n;
        }

        public Circle(){

        }

        public double getArea() {
            return 3.14 * radius * radius;
        }
    }
    public static void main(String[] args) {

        Circle pizza; // 래퍼런스 변수선언
        // pizza는 Circle에대한 주소, 정확히 레퍼선스만 가질 뿐 객체가 아니다.

        pizza = new Circle(); // 객체 생성
        // JAVA에서는 new를 통해서만 객체를 생성한다.

        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();

        System.out.println(area);
    }
}
