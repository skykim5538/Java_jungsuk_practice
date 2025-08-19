package ch13.Ex13_25;

//wait과 notify의 실습

import java.util.ArrayList;

public class WaitNotifyExEx3 {
    public static void main(String[] args) {

    }
}

class Customer3 implements Runnable {
    private Table3 table;
    private String food;
    //Table3 타입(클래스)과 갹체 생성
    //문자열 타입 food 객체 생성

    Customer3(Table3 table, String food) {
        this.table = table;
        this.food = food;
        //Customer3 생성자 선언
    }

    public void run() {
        while (true) {  //일회성이 아닌, 작업을 계속 실행할 것임을 의미
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            // 생성된 쓰레드를 0.1초간 대기상태로 만들고,
            //  대기상태인 쓰레드가 반복문에 의해 동작되고 이때 발생되는
            //예외는 무시하기로 한다.
            String name = Thread.currentThread().getName();
            //현재 쓰레드의 이름을 가져와라.

            table.remove(food);
            //Table3의 table 객체가 가진 remove메서드 실행
            System.out.println(name + "ate a " + food);
            //위와 같이 Customer3.run() 실행시 프린트 함
        }
    }
}


class Cook3 implements Runnable {
    private Table3 table;
    //Table3 클래스(타입) table 객체 생성

    Cook3(Table3 table) {
        this.table = table;
        //생성자 생성
    }

    public void run() {
        while (true) {  //Cook3.run() 실행 시 계속 프로그램을 돌릴 것이다,
            int idx = (int) (Math.random() * (table.dishNum()));
            // 0<= Math.random() < 1*table의 dishNum()의 결과
            table.add(table.dishNames[idx]);
            //add에 table.dishNames[idx]를 대입
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
    }
}


class Table3 {
    String[] dishNames = {"donut", "donut", "buger"};
    //dishNames에 배열 객체 초기화 및 생성
    //donut이 나올 확률을 높였음.
    final int MAX_FOOD = 6;
    // 음식 최대 6개
    private ArrayList<String> dishes = new ArrayList<>();
    //어레이 리스트 지네릭스 dishes
    // => String만 담을 수 있는 비어있는 리스트공간을 만들겠다.
    // 일반 배열 []을 사용하지 않은 이유? - 필요에 따라 크기가 자동으로 늘어나는 동적배열
        //주요 기능 : add remove get
        //<> 쓴 이유 - 컴퍼일 시점에서 오류를 발견하게 만들어줌

    public synchronized void add(String dish) {
        //dish를 매개변수로 받는 add 함수에 sync를 붙임 ->임계영역 지정 (동기화) :데이터 보호
        //하나의 쓰레드가 락을 붙잡고 있지 않도록 wait() ,notify()를 넣어줘야 함.
        while (dishes.size() >= MAX_FOOD) {
            //이 조건이 충족하는 동안
            String name = Thread.currentThread().getName();
            // 현재 쓰레드의 이름을 name에 저장한다.
            System.out.println(name + "is waiting");
            //MAX_FOOD보다 dishes.size()의 크기가 크면 대기상태로 만들겠다.
            try {
                wait();  //cust 쓰레드를 기다리게 한다.
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        dishes.add(dish);
        notify();  //기다리고있던 cust 쓰레드를 깨우기
        System.out.println("dishes:" + dishes.toString());
    }

    public void remove(String dishName) {

        synchronized (this) { //동기화하겠다.
            String name = Thread.currentThread().getName();

            while (dishes.size() == 0) {
                System.out.println(name + "is waiting");
                try {
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }

            while (true) {
                for (int i = 0; i < dishes.size(); i++) {
                    if (dishName.equals(dishes.get(i))) {
                        notify();
                        return;
                    }
                }
                try {
                    System.out.println(name + "is waiting");
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            } //while(true)
        } //synchronized
    }

    public int dishNum() {
        return dishNames.length;
    }

}