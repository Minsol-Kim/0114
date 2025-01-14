package org.example.kiosk.order;

//주문을 받는 사람
//주문(order)에 대한 CRUD 처리하는 존재
//하나만 설계하고싶음 -> enum 이용

import java.util.ArrayList;

public enum OrderService {
    //몇 개나 만들것인지 결정
    INSTANCE;
    //주문 받음 -> 주문 보관
    //주문에 대한 array
    private ArrayList<Order> orders;

    //주문 데이터 초기화 -> 생성자
    private OrderService(){
    orders =new ArrayList<>();
}
    //주문을 받을것 -> 추가
    public void addOrder(Order order){
    orders.add(order);
}

}
