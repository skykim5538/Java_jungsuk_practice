package ch6.Ex6_25;

public class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this("white","auto",4);
    }

    Car(String c) {
        this(c, "auto", 4);
    }

    Car(String c, String g, int d) {
        this.color = c;
        this.gearType = g;
        this.door = d;

    }
}
