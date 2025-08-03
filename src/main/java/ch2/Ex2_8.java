package ch2;

public class Ex2_8 {
    public static void main(String args[]){
        int x = 10, y= 5;
        System.out.println(x+y  );

        // x, y 값 바꾸기
        int temp =x;
        // x의 값을 temp에 넣음
        // x는 여전히 10
        // temp는 10
        x=y;
        // x에 5을 대입
        y=temp;
        // 10을 y에 대입
        System.out.println(x);
        System.out.println(y);



    }
}
