package ch5;

public class Ex5_7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        for(int i=0; i< numArr.length; i++){
            numArr[i] =i;
            System.out.print(numArr[i]);
        }
        System.out.println();
        for(int i=0;i<100;i++) {
            // 100번 랜덤 돌리기 위한 for문
            int n= (int) (Math.random()*10);
            System.out.println("n = "+n);

            int tmp = numArr[0];
            System.out.println("numArr[0]="+numArr[0]);
            System.out.println("tmp = "+tmp);
            // 100번 반복하는 동안 numArr[0]의 값도 100번 바뀜

            numArr[0] = numArr[n];
            System.out.println("numArr[0]="+numArr[0]);
            System.out.println("numArr[n]="+numArr[n]);
                //n번째 인덱스의 값을 0번 인덱스에 저장

            numArr[n] = tmp;
            System.out.println("numArr[n]="+numArr[n]);
            System.out.println(tmp);
        }
        for(int i=0; i< numArr.length; i++){
            System.out.print(numArr[i]);
        }
    }
}
