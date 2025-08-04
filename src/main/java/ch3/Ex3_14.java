package ch3;

public class Ex3_14 {
    public static void main(String args[]){
        String str1 ="abc";
        String str2 = new String("abc");

        System.out.printf(" \"  abc \" ==  \"  abc \"  ? %b%n ","abc"=="abc"); //true
        System.out.printf(" \"  str1 \" ==  \"  abc \"  ? %b%n ","str1"=="abc"); //f str1이라는 문자열로 만들어버림
        System.out.printf(" \"  str2 \" ==  \"  abc \"  ? %b%n ","str2"=="abc"); //f
        System.out.printf("  str1.equals(\"  abc \")  ? %b%n ",str1.equals("abc")); //true
        System.out.printf("  str2.equals(\"  abc \")  ? %b%n ",str2.equals("abc")); //t
        System.out.printf("  str2.equals(\"  ABC \")  ? %b%n ",str2.equals("ABC")); //f 자바는 대소문자 구분함.
        System.out.printf("  str2.equals(\"  ABC \")  ? %b%n ",str2.equals("ABC")); //f
        System.out.printf("  str2.equalsIgnoreCase(\"  ABC \")  ? %b%n ",str2.equalsIgnoreCase("ABC"));
        //equalsIgnoreCase -> 대소문자 구분없이 비교

    }
}
