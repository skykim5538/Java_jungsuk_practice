package ch6;

public class Ex6_28 {
    static int[] arr =new int[10];
        // 스태틱 정수 배열 10칸짜리 초기화

    static{
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100)+1;
            System.out.println("여기야"+arr[i]);
        }


    }
    public static void main(String[] args) {
//        for(int i=0;i<arr.length;i++){
//            // arr의 길이만금 1 증가
//            System.out.println(arr[i]);
//                //arr[0]부터 [9]까지 출력
//        }
    }
}
