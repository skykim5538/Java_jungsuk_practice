package ch5;

public class Ex5_11 {
    public static void main(String[] args) {
        int[] numArray = new int[10];
        int[] counter = new int[10];
        for(int i=0; i<numArray.length; i++) {
            numArray[i] = (int)(Math.random()*10);
            System.out.print(numArray[i]);
        }
        System.out.println();

        for(int i=0; i<numArray.length; i++) {
            counter[numArray[i]]++;
        }
        for(int i=0; i<counter.length; i++) {
            System.out.println(i+"개의 개수 :" +counter[i]);
        }
    }
}
