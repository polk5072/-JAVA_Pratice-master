import java.util.InputMismatchException;
import java.util.Scanner;
public class exception_practice {
    // 예외처리
//    public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         int dividend; // 나뉨수
//         int divisor; // 나눗수
//
//         //Exception in thread "main" java.lang.ArithmeticException: / by zero
//         //at Main.main(Main.java:35)
//          // 0으로 나누므로 예외처리가 된다.
//
//         //이를 try catch 문을 사용하여 해결해보면
//
//         while(true) {
//             System.out.print("나뉨수를 입력하시오 : ");
//             dividend = scanner.nextInt();
//
//             System.out.print("나눗수를 입력하시오 : ");
//             divisor = scanner.nextInt();
//
//             try {
//                 System.out.println(dividend + "를 " + divisor + "로 나눈 몫은 " + dividend / divisor + "입니다");
//                 break;
//             }
//             catch (ArithmeticException e){
//                 System.out.println("0으로는 나눌 수 없습니다. 다시 입력하세요");
//             } finally {
//                 System.out.println("프로그램이 종료됩니다.");
//             }
//         }
//         scanner.close();
//
//      //  위와 같이 try - catch 문을 사용하여 예외 상황을 처리할 수 있다
//  }


//    위와 같은 예외처리는 배열에서도 가능하다 아래 예제

    public static void main(String[] args) {
        int[] intArray = new int[5];

        intArray[0] = 0;

        try{
            for(int i = 0 ; i < 5 ; i++){
                intArray[i+1] = i + 1 + intArray[i];
                System.out.println("intArray["+i+ "] = " + intArray[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
        }finally {
            System.out.println("배열 초기화가 완료되었습니다.");
        }

// 0으로 나눌때 발생하는 예외 - ArrayIndexOutOfBoundsException e
// 범위를 벗어난 배열의 접근 - ArrayIndexOutOfBoundsException e
//  입력 오류 시 발생하는 예외 - InputMismatchException e
// 정수가 아닌 문자열을 정수로 변환할 때 예외 - NumberFormatException e

    }
}
