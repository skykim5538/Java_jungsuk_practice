package ch4;

public class Ex4_34 {
    public static void main(String[] args) {

        Loop1 : for (int i = 2; i <=9; i++) {
            for(int j = 1; j<=9;j++) {
                if(j==5)
                   // break Loop1;
//                break;
//                    continue Loop1;
//                continue ;

                System.out.println(i*j);
            } //j for문 종료
            System.out.println();
        }
    }
}
