package ch3;

public class Ex3_16 {
    // 논리 부정 연산자 -!
    public static void main(String args[]){
        boolean b = true;
        char ch = 'C';

        System.out.printf("b=%b%n",b); //t
        System.out.printf("!b=%b%n",!b); //f
        System.out.printf("!!b=%b%n",!!b); //t
        System.out.printf("!!!b=%b%n",!!!b); //f
        System.out.println();

        System.out.printf("ch=%ch%n",ch); //C
        System.out.printf("ch<'a' ||ch>'z' =%b%n",ch<'a'||ch>'z'); //f
        System.out.printf("!( 'a'<=ch && ch<='z' )=%b%n", !('a'<=ch && ch<='z') ); //f
        System.out.printf(" 'a'<=ch && ch<='z' = %b%n", 'a'<=ch && ch<='z' );// t

    }

}
