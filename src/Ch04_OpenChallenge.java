import java.util.Scanner;

class Player{
    private String name;
    private String word;

    public Player(String name){
        this.name = name;
    }

    String getName(){ return this.name; }
    String getWord(){ return this.word; }
    void setWordFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print(name +" >>");
        this.word = scanner.next();
    }

    boolean checkSuccess(String Word){
        if(Word.charAt(Word.length()-1) == this.word.charAt(0)) return true;
        else return false;
    }

}

public class Ch04_OpenChallenge {


    int people;
    static int gameSet = 0;

    public static void main(String[] args) {
        run();
    }

    public static void run() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("끝말잇기 게임을 시작합니다...");
        System.out.print("게임에 참여하는 인원은 몇명입니까");
        int NumberOfPerson = scanner.nextInt();

        Player[] player = new Player[NumberOfPerson];

        for (int i = 0; i < player.length; i++) {
            System.out.print("참가자의 이름을 입력하세요 >> ");
            String name = scanner.next();
            player[i] = new Player(name);
        }

        System.out.println("시작하는 단어는 아버지입니다.");

        String Word = "아버지";

        while(true){

            for(int i =0 ; i < player.length; i++) {

                player[i].setWordFromUser();

                if(player[i].checkSuccess(Word) == true) {

                    Word = player[i].getWord();
                    continue;

                } else {
                    System.out.println(player[i].getName() +"님이 졌습니다.");
                    System.out.println("게임이 종료됩니다.");
                    gameSet++;
                    break;
                }
            }

            if(gameSet == 1) break;

        }

        scanner.close();
    }
}
