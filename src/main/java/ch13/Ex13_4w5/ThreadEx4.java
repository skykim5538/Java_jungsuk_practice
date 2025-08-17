package ch13.Ex13_4w5;

//싱글 스레드와 멀티쓰레드 차이

//싱글스레드
//"-" 과 "|"를 출력하는 작업을, '하나의'쓰레드가 연속적으로 처리하하는 시간을 측정하는 예제
// 그래서 "-" 출력이 끝난 후 "|"이 출력된다.
public class ThreadEx4 {
    public static void main(String args[]){
        long startTime = System.currentTimeMillis();

        for(int i=0;i<100_000;i++) //10만 단위를 언더바 쓰는 이유?=가독성 때문
                //i가 0부터 10만 미만까지 아래의 식을 반복하며 1씩 증가하는 반복문 
            System.out.printf("%s","-");
                //"-"를 출력해라 
            System.out.print("소요시간 1 = " +(System.currentTimeMillis()-startTime));

        System.out.printf("%n%n%n%n");
                //줄 띄우기 
        for(int i=0;i<100_000;i++)
                // 상동
            System.out.printf("%s","|");
        System.out.print("소요시간 2 = " +(System.currentTimeMillis()-startTime));

    }
    }
    //소요시간 1 : 218
    //소요시간 2 : 365

