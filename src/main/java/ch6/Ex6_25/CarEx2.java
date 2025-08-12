package ch6.Ex6_25;



public class CarEx2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");
        Car c3 = new Car("red","manual",4);

        System.out.println(c1.color); // 기본값 출력
        System.out.println(c2.color); // 입력된 인자를 참조
        System.out.println(c3.color + c3.gearType + c3.door); // 입력된 인자를 참조

    }
}
