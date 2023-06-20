class Method{

    public int getSum(int i, int j){
        return i + j;
    }

    public int getSum(int i, int j, int k){
        return i + j + k;
    }
    // 메소드 오버로딩 시 getSum()메소드의 매개변수 개수와 타입이 모두 같을 경우 호출자의 입장에서 구분할 수 없으므로
    // 컴파일 오류가 발생한다.
}
public class MethodOverloading {

}
