package ch4;

public class Ex4_27 {
    public static void main(String args[]){
        int sum = 0;
        int i = 0;

        //i를 1 씩 증가시키며 sum을 구함
        while ((sum += ++i) <= 35){
            System.out.printf("%d - %d%n", i, sum);
        }// print f 는 행 열 개념을 사용 못하므로 %n을 붙인다.
    }
}
