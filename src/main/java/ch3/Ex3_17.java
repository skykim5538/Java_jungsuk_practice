package ch3;

public class Ex3_17 {
    public static void main(String[] args) {
        int x,y,z;
        int absX,absY,absZ;
        char signX,signY,signZ;

        x=10;
        y=-5;
        z=0;
        // 연산자 우선 순위
        //산술>비교>논리>대입 순서
        //
        absX= x>=0?x:-x; //x가 0보다 클때, 참 : 거짓
        absY= y>=0?y:-y;
        absZ= z>=0?z:-z;

        signX = x>0? '+' : (x==0 ? ' ':'-'); //x가 0보다 크니, +
        signY = y>0? '+' : (y==0 ? ' ':'-'); //y는 0보다 작으니, (y==0 ? ' ':'-') 조건식 실행, -
        signZ = z>0? '+' : (z==0 ? ' ':'-'); // ' '


        System.out.printf("x=%c%d%n", signX, absX); // signX = '+', absX = 10
        System.out.printf("y=%c%d%n", signY, absY);  // signY = '-' absY = 5
        System.out.printf("z=%c%d%n", signZ, absZ);

    }
}
