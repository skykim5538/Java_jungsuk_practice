package ch4;

public class Ex4_24 {
    public static void main(String[] args) {
        int i = 5;
//        while (i--!=0){ //먼저 비교 후, -1 감소되어 출력 조건을 만족하면 -1된 값이 출력
                    // 후위형 - 모든 조건을 다 끝내고 -1한 후 출력해라.
        while (--i!=0){  // 먼저 -1 감소 후 , 비교
                    // 전위형 - 모든 조건을 시작하기 전에 -1해라.
            System.out.println(i+"here it is");
        }
    }
}
