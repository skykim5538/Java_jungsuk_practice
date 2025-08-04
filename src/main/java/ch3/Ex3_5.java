package ch3;

public class Ex3_5 {
    //형변환 연산자
    public static void main(String args[]){
        double d = 85.4;
        int score =(int) d;
//        int score2 =int d;  문법 에러
        System.out.println("score= "+score); // 85.4 반올림
        System.out.println("d= "+d);
    }
}
