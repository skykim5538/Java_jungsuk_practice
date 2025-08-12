package ch6.Ex6_24;

class Car {
    String color;
    String gearType;
    int door;

    Car(){}

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;

        this.color = color;
        this.gearType = gearType;
        this.door = door;



    }
}

class CarEx{
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
        car.gearType = "brown";
        car.door = 7;

        Car car2 = new Car("red", "brown", 7);

    }
}
