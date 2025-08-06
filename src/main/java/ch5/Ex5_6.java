package ch5;

//배열과 반복문으로 최대 최소값 찾기
public class Ex5_6 {
    public static void main(String[] args) {
        int[] score = {79,88,91,33,10,100,55,95};

        int max = score[0]; //배열의 최댓값을 첫벗째로 초기화
        int min = score[0]; // 배열의 최소값을 첫번째로 초기화
                            //-> 이게 필요한 이유?
        for(int i = 1;i<score.length;i++) {
            if(score[i]>max) {
                max = score[i];
                // 반복문으로 인덱스 번호를 굴려서 이 중에서 최대값을 대입
            }else if(score[i]<min) {
                min = score[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
