import java.util.Scanner;
public class Practice_Sample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하시오: ");
        int amount = scanner.nextInt();

        while(amount != 0) {            // 실습 예제는 if문이 실습 대상이지만 변수의 갯수를 하나로 제한하여 문제를 풀음
            if (amount > 50000) {
                System.out.println("오만원권 : " + amount / 50000 + "매");
                amount %= 50000;        // amount에서 50000의 몫의 갯수만큼 제한 후 남은 금액을 amount에 저장한다.
            } else if (amount > 10000) {
                System.out.println("만원권 : " + amount / 10000 + "매");
                amount %= 10000;
            } else if (amount > 5000) {
                System.out.println("오천원권 : " + amount / 5000 + "매");
                amount %= 5000;
            } else if (amount > 1000) {
                System.out.println("천원권 : " + amount / 1000 + "매");
                amount %= 1000;
            }else if (amount > 500) {
                System.out.println("오백원 : " + amount / 500 + "개");
                amount %= 500;
            }else if (amount > 100) {
                System.out.println("백원 : " + amount / 100 + "개");
                amount %= 100;
            }else if (amount >= 50) {
                System.out.println("오십원 : " + amount / 50 + "개");
                amount %= 50;
            }else if (amount >= 10) {
                System.out.println("십원 : " + amount / 10 + "개");
                amount %= 10;
            }else if (amount > 1) {
                System.out.println("일원 : " + amount / 1 + "개");
                amount %= 1;
            }
        }

        scanner.close();
    }
}
