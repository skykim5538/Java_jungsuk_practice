package ch5;

import java.util.Arrays;
//배열의 길이는 바꾸는 방법
//바꾸기 전 배열을 다른 객체에 담아두고,
//새로운 변수 배열을 생성한 후 옮겨넣는다.
public class Ex5_3 {
    public static void main (String[] args) {
        int[] arr = new int[5];

        for(int i=0;i<arr.length;i++)
            arr[i] = i+1;// 배열에 1에서 5까지 정수 저장

        System.out.println("변경전");
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        } // 배열 조회용
        //--------------------------------------//
        int[] tmp = new int[arr.length*2];
        // tmp 라는 정수 배열 객체에 기존 arr*2배 만큼 길이 생성
        for(int i=0; i<arr.length;i++)
            tmp[i] = arr[i];
        // 배열 arr에 저장된 값의 배열을 tmp에 복사
        // arr[1~5] 값을 순차적으로 같은 인덱스로 저장시킴
        arr = tmp;


        System.out.println("변경후");
        System.out.println("arr.length"+arr.length);
        for(int i=0; i<arr.length;i++)
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
    }
}
