package ch5;
// 배열로 평균 구하기/ 
public class Ex5_5 {
    public static void main(String[] args) {
        int sum = 0;
        float avg = 0f;

        int[] score = {100,88,100,100,90};
        for(int i=0; i<score.length; i++){
            sum += score[i];
            //100+88+100+100+90
        }
        avg = sum/(float)score.length;
        //배열의 길이가 곧 전체 객체 객수
        System.out.println(avg);
        System.out.println(sum);

    }
}
