package ch3;

public class Ex3_2 {
    //증감연산자 ->i에 1을 더하거나 빼기
    public static void main(String args[]){
        int i=5 , j=0;

        j=i++; // 후위형 -> 값이 참조된 후에 증가
                // i를 먼저 j에 대입한 후에 i에 +1
        System.out.println("j=i++; 실행 후, i="+i+",j="+j);

        i=5;
        j=0;

        j=++i; //전위형 -> i에 먼저 +1 한 후에 j에 대입
        System.out.println("j=i++; 실행 후, i="+i+",j="+j);
    }
}
