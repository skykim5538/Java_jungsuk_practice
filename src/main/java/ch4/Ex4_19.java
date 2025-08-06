package ch4;

public class Ex4_19 {
    public static void main(String[] args) {
        for(int i=2;i<=9;i++){
            for(int j=1;j<=9;j++){
                //i가 2일 때, j가 1에서 9까지 반복 후
                //i가 3이 된다.
                System.out.printf("%d*%d = %d%n",i,j,i*j);
            }
        }
    }
}
