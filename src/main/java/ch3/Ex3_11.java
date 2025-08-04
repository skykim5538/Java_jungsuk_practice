package ch3;

public class Ex3_11 {
    public static void main(String[] args) {
        double pi = 3.1415921234;
        double shortpi = Math.round(pi*1000)/1000.0;
            // Math.round(3141.592) -> 소수 첫째자리 반올림 => 3142
            // 3142/1000.0 => 3.142
        System.out.println(shortpi);


    }
}
