import java.util.Scanner;

public class OpenChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String boy, girl;

        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
        System.out.print("철수 >>> ");
        boy = scanner.next();

        System.out.print("영희 >>> ");
        girl = scanner.next();

        if(boy.equals("바위")){
            if(girl.equals("가위")) System.out.println("철수가 이겼습니다");
            else if(girl.equals("보")) System.out.println("영희가 이겼습니다.");
            else System.out.println("비겼습니다.");
        }

        if(boy.equals("가위")){
            if(girl.equals("가위")) System.out.println("비겼습니다.");
            else if(girl.equals("보")) System.out.println("철수가 이겼습니다.");
            else System.out.println("영희가 이겼습니다.");
        }

        if(boy.equals("보")){
            if(girl.equals("가위")) System.out.println("영희가 이겼습니다");
            else if(girl.equals("보")) System.out.println("비겼습니다..");
            else System.out.println("철수가 이겼습니다..");
        }

        scanner.close();
    }
}
